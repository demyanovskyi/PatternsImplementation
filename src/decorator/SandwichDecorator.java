package decorator;

public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich decoratedSandwich;

    SandwichDecorator(Sandwich decoratedSandwich) {
        super();
        this.decoratedSandwich = decoratedSandwich;
    }
}
