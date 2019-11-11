package lab3.Factory;

public class NYPizzaStore extends AbstractFactory {

    public Pizza createPizza(String pizzaName){
            Pizza pizza= new NewYorkPizza(pizzaName);
            System.out.println("Create in NY style");
            return pizza;

    }
}
