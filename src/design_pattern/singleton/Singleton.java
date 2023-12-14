package design_pattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton obyekti yaratildi");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton dan salom!");
    }

}