package lab3.Factory;

import lab3.Factory.Pizza;

public class NewYorkPizza extends Pizza {
    public NewYorkPizza(String pizzaName){
        super(pizzaName);

    }

    @Override
    public void prepare(){
        System.out.println("prepare NYpizza");
        setDaugh("crispy");
        setSauce("spicey");

    }

}
