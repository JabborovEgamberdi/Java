package data_structure.queue;

import java.util.Arrays;

public class CircleQueue {

    private int[] items;
    private int front = -1;
    private int rear = -1;

    public CircleQueue(int n) {
        items = new int[n];
    }

    public void enqueue(int item) { // addLast
        rear = (rear + 1) % items.length;
        items[rear] = item;
    }

    public int dequeue() { // remove first
        front = (front + 1) % 10;
        var temp = items[front];
        items[front] = 0;
        return temp;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

}