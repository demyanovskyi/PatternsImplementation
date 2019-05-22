package strategy;

public class IncandescentLamp implements LampHolderE27 {
    @Override
    public void shine() {
        System.out.println("warm light is shining");
    }
}
