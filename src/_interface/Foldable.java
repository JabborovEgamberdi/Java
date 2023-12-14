package _interface;

public interface Foldable {

    static int printFoldInstructions(int a, int b) {
        System.out.println("Carefully fold the object");
        return a + b;
    }

    default void fold() {
        System.out.println("Folding the object");
    }

}