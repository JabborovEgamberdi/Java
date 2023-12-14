package _interface;

public class Bag implements Foldable, Washable {

    @Override
    public void fold() {
        System.out.println("Folding bag");
    }

    @Override
    public void wash() {
        System.out.println("Washing bag.");
    }

}