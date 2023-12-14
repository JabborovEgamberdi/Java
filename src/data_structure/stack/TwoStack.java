package data_structure.stack;

public class TwoStack {

    private int[] items;
    private int count1;
    private int count2;

    public TwoStack(int n) {
        items = new int[n];
        count1 = 0;
        count2 = n / 2;
    }

    public boolean isEmpty1() {
        return count1 == 0;
    }

    public boolean isEmpty2() {
        return count2 == items.length / 2;
    }

    public boolean isFull1() {
        return count1 == items.length / 2;
    }

    public boolean isFull2() {
        return count2 == items.length;
    }

    public void push1(int item) {
        if (isFull1()) {
            throw new StackOverflowError();
        }
        items[count1++] = item;
        count1++;
    }

    public void push2(int item) {
        if (isFull2()) {
            throw new StackOverflowError();
        }
        items[count2++] = item;
        count2++;
    }

    public int peek1() {
        if (isEmpty1()) {
            throw new IllegalStateException();
        }
        return items[count1 - 1];
    }

    public int peek2() {
        if (isEmpty2()) {
            throw new IllegalStateException();
        }
        return items[count2 - 1];
    }

    public int pop1() {
        if (isEmpty1()) {
            throw new IllegalStateException();
        }
        return items[--count1];
    }

    public int pop2() {
        if (isEmpty2()) {
            throw new IllegalStateException();
        }
        return items[--count2];
    }

    public int[] print1() {
        int[] arr = new int[]{};
        for (int i = 0; i < count1; i++) {
            arr = new int[]{items[i]};
        }
        return arr;
    }

    public int[] print2() {
        int[] arr = new int[]{};
        for (int i = 0; i < count2; i++) {
            arr = new int[]{items[i]};
        }
        return arr;
    }

}
