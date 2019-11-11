package lab3.Visitor;

public class Book implements Element {
    private int price;
    private int nrPages;
    public Book(int price,int nrPages){
        this.price=price;
        this.nrPages=nrPages;

    }

    public int getPrice() {
        return price;
    }

    public int getNrPages() {
        return nrPages;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);

    }
}
