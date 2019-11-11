package lab3.Factory;

import lab3.Factory.Pizza;

public abstract class AbstractFactory {

    public abstract Pizza createPizza(String pizzaName);

    public Pizza orderPizza(String pizzaName){
        Pizza pizza= createPizza(pizzaName);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();


        return pizza;

    }

}
