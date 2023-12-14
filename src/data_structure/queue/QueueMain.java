package data_structure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        queue.remove(4);
        System.out.println(queue);
        queue.offer(5);
        System.out.println(queue);
        System.out.println(queue.size());
        int[] arr = new int[]{};
        System.out.println(arr.length);

        System.out.println("----------ArrayQueue---------");
        ArrayQueue arrayQueue1 = new ArrayQueue(8);
        arrayQueue1.enqueue(5);
        arrayQueue1.enqueue(6);
        arrayQueue1.enqueue(3);
        arrayQueue1.enqueue(7);
        arrayQueue1.enqueue(1);
        arrayQueue1.print();
        System.out.println(arrayQueue1.dequeue());
        arrayQueue1.print();

        System.out.println("-----CircleQueue------");
        CircleQueue circleQueue = new CircleQueue(3);
        circleQueue.enqueue(1);
        circleQueue.enqueue(2);
        circleQueue.enqueue(3);
        circleQueue.enqueue(4);
        circleQueue.enqueue(5);
        circleQueue.print();
        System.out.println(circleQueue.dequeue());
        circleQueue.print();

        System.out.println("-----StackQueue------");
        StackQueue stackQueue = new StackQueue();
        stackQueue.enqueue(1);
        stackQueue.enqueue(2);
        stackQueue.enqueue(3);
        stackQueue.enqueue(4);
        stackQueue.print();
        System.out.println(stackQueue.dequeue());
        stackQueue.print();

        System.out.println("-----LinkedQueue------");
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.print();
        System.out.println();
        System.out.println(linkedQueue.dequeue());
        linkedQueue.print();

    }

}