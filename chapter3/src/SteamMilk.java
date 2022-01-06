package chapter3;

public class SteamMilk extends CondimentDecorator {

    private final Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }

    @Override
    public String getDescription() {
        return this.beverage.description + ", 스팀밀크";
    }

}
