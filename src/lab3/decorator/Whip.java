package lab3.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){

        super("Whip",1,beverage);
    }
}
