package strategy;

public class Main {
    public static void main(String args[]) {
        LampHolderE27Context lamp = new LampHolderE27Context();
        lamp.setLampHolderE27(new IncandescentLamp());
        lamp.turnOnTheLamp();
    }
}
