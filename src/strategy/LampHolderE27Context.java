package strategy;

public class LampHolderE27Context {
    private LampHolderE27 lampHolderE27;

    public LampHolderE27 getLampHolderE27() {
        return lampHolderE27;
    }

    public void setLampHolderE27(LampHolderE27 lampHolderE27) {
        this.lampHolderE27 = lampHolderE27;
    }

    public void turnOnTheLamp() {
        lampHolderE27.shine();
    }
}
