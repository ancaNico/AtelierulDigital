package lab3.Visitor;

public class Video implements Element {

    private int price;
    private int time;
    public Video(int price,int time){
        this.price=price;
        this.time=time;

    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);

    }
}
