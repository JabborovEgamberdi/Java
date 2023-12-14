package _interface;

public class Item implements Foldable, Washable {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void fold() {
        System.out.println("Folding " + name);
    }

    public void wash() {
        System.out.println("Washing " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(Foldable.printFoldInstructions(4, 5));
        Item item = new Item("John");
        item.fold();
    }

}