package lab3.decorator;

public class Main {
    public static void main(String[] argv) {
        Beverage beverage= new DarkRoast();
        Beverage soy= new Soy(beverage);
        Espresso espresso = new Espresso();
        Milk milk = new Milk(espresso);
        Whip whip= new Whip(milk);
        Beverage milk2= new Milk(soy);
        System.out.println("Cost="+ whip.getCost());
        System.out.println("Description"+whip.getDescription());
    }
}