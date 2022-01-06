package chapter3;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.19 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.description + ", 두유";
    }

}
