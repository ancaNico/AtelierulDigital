package lab3.Factory;

public class ChicagoPizzaStore extends AbstractFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza=null;
        if (pizzaName == "Chicago1"){

             pizza = new ChicagoPizza(pizzaName);
        }
        else{
            if( pizzaName == "Chicago2"){

                pizza = new ChicagoPizza2(pizzaName);
            }
        }

        System.out.println("Create in Chicago style");
        System.out.println("Extra step 0");
        return pizza;

    }
}


