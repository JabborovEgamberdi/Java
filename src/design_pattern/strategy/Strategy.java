package design_pattern.strategy;

public interface Strategy {
    void execute();
}

class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy 1");
    }
}

class ConcreteStrategy2 implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing strategy 2");
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}
