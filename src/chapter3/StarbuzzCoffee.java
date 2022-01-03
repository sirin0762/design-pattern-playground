package chapter3;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription()  + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription()  + " $" + houseBlend.cost());
    }

}
