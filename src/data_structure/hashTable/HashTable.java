package data_structure.hashTable;

import java.util.LinkedList;

public class HashTable {

    class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries;

    public HashTable() {
        entries = new LinkedList[5];
    }

    public void put(int key, String value) {
        int index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        var list = entries[index];
        for (Entry entry : list) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        Entry entry = new Entry(key, value);
        list.addLast(entry);
    }

    public String get(int key) {
        int index = hash(key);
        if (entries[index] != null) {
            var list = entries[index];
            for (Entry entry : list) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public boolean remove(int key) {
        int index = hash(key);
        if (entries[index] != null) {
            var list = entries[index];
            for (Entry entry : list) {
                if (entry.key == key) {
                    return entries[index].remove(entry);
                }
            }
        }
        return false;
    }

    public int size() {
        int size = 0;
        for (LinkedList<Entry> list : entries) {
            if (list != null) {
                size += list.size();
            }
        }
        return size;

    }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        String s = "";
        for (LinkedList<Entry> list : entries) {
            if (list != null) {
                for (Entry value : list) {
                    s += " " + value.value + " ";
                }
                s += "\n";
            }
        }
        return s;
    }

}
