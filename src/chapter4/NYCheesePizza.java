package chapter4;

public class NYCheesePizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "NY Style Sauce and Cheese Pizza";
    }

    @Override
    void prepare() {
        System.out.println("Preparing ... " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

}
