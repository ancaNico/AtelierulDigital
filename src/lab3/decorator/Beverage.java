package lab3.decorator;

public class Beverage {

    private int cost;
    private String description;


    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
    public Beverage(String description, int cost){
        this.description=description;
        this.cost=cost;

    }
}
