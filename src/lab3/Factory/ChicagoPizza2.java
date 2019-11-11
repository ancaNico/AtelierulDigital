package lab3.Factory;

import lab3.Factory.Pizza;

public class ChicagoPizza2 extends Pizza {

    public ChicagoPizza2(String name){
        super(name);
    }

    @Override
    public void prepare(){
        System.out.println("prepare chicago2");
        setDaugh("CHICAGO 2");
        setSauce("sweet2");

    }
}
