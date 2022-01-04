package chapter4;

public class ChicagoCheesePizza extends Pizza {

    private final PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "Chicago style Deep Dish Cheese Pizza";

    }
    @Override
    void prepare() {
        System.out.println("Preparing ... " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    void cut() {
        System.out.println("Cutting the piza into square slices");
    }

}
