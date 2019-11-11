package lab3.Visitor;

public class Visitor {

    private int totalPrice=0;
    private int totalTime=0;

    public void visit(Book book){
        totalPrice=totalPrice+book.getPrice();
        totalTime=totalTime+book.getNrPages();
        //return book.getPrice();
    };

    public int visit(Video video){
        totalTime=totalTime+video.getTime();
        totalPrice=totalPrice+ video.getPrice();
        return video.getPrice();
    };

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalTime() {
        return totalTime;
    }
}
