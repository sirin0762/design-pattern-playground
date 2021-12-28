package chapter1;

public class MallardDuck extends Duck {

    public MallardDuck(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck display");
    }

    @Override
    public void fly() {
        // do nothing
    }

}
