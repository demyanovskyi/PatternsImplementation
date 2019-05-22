package decorator;

public class Main {
    public static void main(String args []){
        Sandwich sandwich1 = new BlueCheeseDecorator(new TomatDecorator(new BasicSandwich())) {
        };
        Sandwich sandwich2 = new TomatDecorator(new BasicSandwich());
     sandwich1.assemble();
        System.out.println("------------------");
     sandwich2.assemble();
        System.out.println("------------------");
    }
}
