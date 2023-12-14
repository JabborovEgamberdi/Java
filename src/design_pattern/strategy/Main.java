package design_pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(() -> System.out.println("In main"));
        context.executeStrategy();
    }
}
