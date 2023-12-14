package design_pattern.decorator;

public class Main {
    public static void main(String[] args) {
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(
                new ConcreteComponent()
        );
        concreteDecorator.operation();

    }
}
