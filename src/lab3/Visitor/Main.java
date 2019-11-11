package lab3.Visitor;

public class Main {
    public static void main(String[] argv){
        Element e1= new Book(10,220);
        Element e2= new Book(12,20);
        Element e3= new Book(102,230);

        Element v1= new Video(20,220);
        Element v2= new Video(24,20);
        Element v3= new Video(25,260);


        Element[] elements = new Element[]{e1,e2,e3,v1,v2};
        Visitor visitor= new Visitor();
        for (Element e: elements){
            e.accept(visitor);

        }
        System.out.println("pRICE="+ visitor.getTotalPrice());
        System.out.println("time="+ visitor.getTotalTime());
    }
}
