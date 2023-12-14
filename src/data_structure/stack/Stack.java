package data_structure.stack;

import java.util.Arrays;

public class Stack {

    private int[] items;
    private int count;

    public Stack(int n) {
        items = new int[n];
    }

    public void push(int item) {
        if (items.length == count) {
            throw new StackOverflowError();
        }
        items[count++] = item;
    }

    public int peek() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[count - 1];
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public String toString(int[] items) {
        var content = Arrays.copyOfRange(items, 0, count);
         return Arrays.toString(content);
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }

}
