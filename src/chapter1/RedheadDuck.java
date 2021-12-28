package chapter1;

public class RedheadDuck extends Duck {

    public RedheadDuck(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck display");
    }

}
