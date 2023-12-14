package data_structure.queue;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int front;
    private int rear;

    public ArrayQueue(int n) {
        items = new int[n];
    }

    public void enqueue(int item) {
        if (items.length == rear) {
            throw new StackOverflowError();
        }
        items[rear++] = item;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front++;
        System.out.println(front);
        return item;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

}