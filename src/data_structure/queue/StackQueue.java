package data_structure.queue;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack1.isEmpty()) throw new IllegalStateException();

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        Integer pop = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return pop;
    }

    public void print() {
        System.out.println(Arrays.toString(stack1.toArray()));
    }

}