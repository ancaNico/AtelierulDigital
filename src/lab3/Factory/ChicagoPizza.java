package lab3.Factory;

import lab3.Factory.Pizza;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza(String pizzaName){
        super(pizzaName);

    }

    @Override
    public void prepare(){
        System.out.println("prepare");
        setDaugh("SWEET CHICAGO");
        setSauce("sweet");

    }

}



