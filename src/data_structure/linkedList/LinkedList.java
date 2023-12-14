package data_structure.linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    // did not work
    public int[] reverse() {
        int[] arr = new int[size];
        var current = first;
        int index = 0;

        while (current != null) {
            arr[index++] = current.value;
            current = current.prev;
            size--;
        }
        return arr;
    }

    // did not work
    public void lastIndexOf(int item) {
        var node = new Node(item);
        var current = last;
        int index = 0;
        while (current != null) {
            if (current.value == item) {
                System.out.println(index);
                break;
            } else {
                current = current.prev;
                index++;
            }
        }

    }

    public int lastIndexOf1(int item) {
        var node = new Node(item);
        var current = first;
        while (current != null) {
            if (current.next == node) {
                var first = current.next;
                if (lastIndexOf1(first.value) == -1) {
                    return first.value;
                }
            } else {
                current = current.next;
            }
        }
        return -1;
    }

    // O (n)
    public boolean search(int item) {
        var node = new Node(item);
        var current = first;
        while (current != null) {
            if (current.value == node.value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int[] toArray(){
        int[] arr = new int[size];
        var current = first;
        int index = 0;
        while (current != null) {
            arr[index] = current.value;
            index++;
            current = current.next;
        }
        return arr;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) {
                return current;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value + "");
            temp = temp.next;
        }
    }

}