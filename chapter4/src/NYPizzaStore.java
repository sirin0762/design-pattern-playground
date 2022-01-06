package chapter4;

import java.util.Objects;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();
        if(Objects.equals(item, "cheese")) {
            return new NYCheesePizza(ingredientFactory);
        } else if(item.equals("greek")) {
            return new NYGreekPizza(ingredientFactory);
        } else if(item.equals("pepperoni")) {
            return new NYPappernoniPizza(ingredientFactory);
        } else {
            return null;
        }
    }

}
