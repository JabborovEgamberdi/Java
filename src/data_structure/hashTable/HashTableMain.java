package data_structure.hashTable;

public class HashTableMain {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(1, "Data");
        hashTable.put(2, "Structure");
        hashTable.put(3, "And");
        hashTable.put(4, "Algorithm");
        System.out.println(hashTable);
        System.out.println(hashTable.get(4));
        hashTable.remove(4);
        System.out.println(hashTable);
        System.out.println(hashTable.size());

    }

}