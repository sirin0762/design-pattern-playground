package chapter4;

import java.util.Objects;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(Objects.equals(type, "cheese")) {
            return new ChicagoCheesePizza();
        } else if(type.equals("greek")) {
            return new ChicagoGreekPizza();
        } else if(type.equals("pepperoni")) {
            return new ChicagoPappernoniPizza();
        } else {
            return null;
        }
    }

}
