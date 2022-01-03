package chapter3;

public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.25 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", 휘핑크림";
    }

}
