package decorator;

public class BasicSandwich implements Sandwich {
    @Override
    public void assemble() {
        System.out.print("Sandwich ");
    }
}
