package design_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        concreteCreator.factoryMethod().create();
    }
}
