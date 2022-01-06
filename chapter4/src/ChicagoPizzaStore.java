package chapter4;

import java.util.Objects;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
        if(Objects.equals(type, "cheese")) {
            return new ChicagoCheesePizza(ingredientFactory);
        } else if(type.equals("greek")) {
            return new ChicagoGreekPizza();
        } else if(type.equals("pepperoni")) {
            return new ChicagoPappernoniPizza();
        } else {
            return null;
        }
    }

}
