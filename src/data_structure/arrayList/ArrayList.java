package data_structure.arrayList;

public class ArrayList {

    private int[] items;
    private int count;

    public ArrayList(int length) {
        items = new int[length];
    }

    public void insertAt(int item, int index) {
//        if(index >= count || index < 0)
//            throw new IllegalArgumentException("Illegal index");
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        count++;
        items[index] = item;
    }

    public void removeAt(int itemOfIndex) {
        if(itemOfIndex > count || itemOfIndex < 0)
            throw new ArrayIndexOutOfBoundsException("Illegal index");
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == itemOfIndex) {
                index = i;
            }
        }
        count--;
        for (int i = items.length - 1; i >= index; i--) {
            items[i - 1] = items[i];
        }
    }

    public void removeAt2(int index) {
        if(index > count || index < 0)
            throw new ArrayIndexOutOfBoundsException("Illegal index");
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void reverse() {
        int index = 0;
        int[] arr = new int[items.length];
        for (int i = items.length - 1; i > 0; i--) {
            arr[index] = items[i];
            index++;
        }
        items = arr;
    }

    public int indexOf(int item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int length() {
        return items.length;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}