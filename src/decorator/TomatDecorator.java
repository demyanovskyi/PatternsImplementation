package decorator;

public class TomatDecorator extends SandwichDecorator {
    TomatDecorator(Sandwich decoratedSandwich) {
        super(decoratedSandwich);
    }

    @Override
    public void assemble() {
        decoratedSandwich.assemble();
        System.out.println("decorated with chery tomatoes");
    }
}
