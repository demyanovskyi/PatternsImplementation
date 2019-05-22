package strategy;

public class FluorescentLam implements LampHolderE27 {
    @Override
    public void shine() {
        System.out.println("cold light is shining");
    }
}
