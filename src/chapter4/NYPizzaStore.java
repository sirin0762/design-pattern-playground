package chapter4;

import java.util.Objects;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if(Objects.equals(item, "cheese")) {
            return new NYCheesePizza();
        } else if(item.equals("greek")) {
            return new NYGreekPizza();
        } else if(item.equals("pepperoni")) {
            return new NYPappernoniPizza();
        } else {
            return null;
        }
    }

}
