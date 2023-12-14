package data_structure.arrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.insert(3);
        arrayList.insert(8);
        arrayList.insert(4);
        arrayList.insert(6);
        arrayList.insert(9);
        arrayList.insert(12);
        arrayList.insert(15);
        arrayList.insert(13);
        arrayList.insert(11);
//        arrayList.print();
        System.out.println("arrayList.indexOf(20) = " + arrayList.indexOf(20));
        System.out.println("arrayList.indexOf(4) = " + arrayList.indexOf(4));
        System.out.println("arrayList.length() = " + arrayList.length());
        arrayList.insertAt(0, 15);
        arrayList.print();
        arrayList.removeAt2(0);
        arrayList.print();
        System.out.println("-----------------------reverse-----------------------");
        arrayList.reverse();
        arrayList.print();

//        ArrayList arrayList1 = new ArrayList(6);
//        System.out.println("arrayList1.length() = " + arrayList1.length());
//        java.util.ArrayList<Integer> arrayList2 = new java.util.ArrayList<>();
//        arrayList2.add(10, 21);

    }
}