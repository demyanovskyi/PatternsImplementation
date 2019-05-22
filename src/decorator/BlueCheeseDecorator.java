package decorator;

public class BlueCheeseDecorator extends SandwichDecorator {
    BlueCheeseDecorator(Sandwich decoratedSandwich) {
        super(decoratedSandwich);
    }

    @Override
    public void assemble() {
        decoratedSandwich.assemble();
        System.out.println("decorated with blue cheese");
    }
}
