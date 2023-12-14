package data_structure.linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(2);
        linkedList.addLast(4);
        linkedList.addLast(1);
        linkedList.addLast(5);
        linkedList.addFirst(7);
        System.out.println("--------");
        System.out.println(linkedList.lastIndexOf1(5));
        System.out.println("--------");
        System.out.println(linkedList.contains(3));
        System.out.println("--------------------");
        linkedList.removeFirst();
        System.out.println("--------------------");
        linkedList.removeLast();
        linkedList.print();
        System.out.println("--------------------");
        linkedList.toArray();
        linkedList.print();
        System.out.println("linkedList.size() = " + linkedList.size());
//        linkedList.reverse();
//        linkedList.print();
        System.out.println("--------------------");
        System.out.println("linkedList.search(4) = " + linkedList.search(4));
        linkedList.lastIndexOf(4);
        System.out.println();

    }
}