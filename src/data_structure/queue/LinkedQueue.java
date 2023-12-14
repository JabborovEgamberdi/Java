package data_structure.queue;


public class LinkedQueue {

    public static class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public LinkedQueue() {
        first = null;
        last = null;
    }

    public int size() {
        return size;
    }

    public void enqueue(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        }
        last.next = node;
        last = node;
    }

    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();
        if (first == last) {
            int value = first.value;
            first = last = null;
            return value;
        }
        int value = first.value;
        var second = first.next;
        first.next = null;
        first = second;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return first == null && last == null;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

}