package data_structure.stack;


public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);
        stack.print();
        System.out.println("stack.pop() = " + stack.pop());
        stack.print();
        System.out.println("stack = " + stack);
        stack.print();

        TwoStack twoStack = new TwoStack(8);
        twoStack.push1(1);
        twoStack.push1(2);
        twoStack.push2(3);
        twoStack.push2(4);
        System.out.println("twoStack = " + twoStack);
        System.out.println("twoStack.peek1() = " + twoStack.peek1());
        System.out.println("twoStack.peek2() = " + twoStack.peek2());
        System.out.println("twoStack = " + twoStack);
        System.out.println("twoStack.pop1() = " + twoStack.pop1());
        twoStack.print1();
        System.out.println("twoStack.pop1() = " + twoStack.pop1());
        twoStack.print1();
        System.out.println("twoStack.pop1() = " + twoStack.pop1());
        twoStack.print1();
        twoStack.print2();
        System.out.println("twoStack.pop2() = " + twoStack.pop2());
        twoStack.print2();
        System.out.println("twoStack.pop2() = " + twoStack.pop2());
        twoStack.print2();
        System.out.println("twoStack.pop2() = " + twoStack.pop2());
        twoStack.print2();
        System.out.println("twoStack = " + twoStack);
    }

}