package lab6.leaders;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GenericLeaders <T extends Comparable>{
    private List<T>content=null;
    public GenericLeaders(List<T> content)
    {
        this.content=content;


    }
    public void displayLeaders(){


        Collections.reverse(content);
        System.out.println(content);

        T max=content.get(0);
        System.out.print(max);
        Iterator<T> i=content.iterator();
        while(i.hasNext()){
            T current=i.next();
            if(max.compareTo(current)<0){//daca primul e mai mare returneaza -1
                max=current;
                System.out.println(" "+max);

            }

        }

    }

}
