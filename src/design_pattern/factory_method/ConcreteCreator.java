package design_pattern.factory_method;

interface Product {
    void create();
}

class ConcreteProduct implements Product {
    @Override
    public void create() {
        System.out.println("ConcreteProduct created");
    }
}

abstract class Creator {
    public abstract Product factoryMethod();
}

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}