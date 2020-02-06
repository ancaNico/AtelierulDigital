package lab6.leaders;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Leaders {
    private List<Integer>content=null;
    public Leaders(List<Integer> content)
    {
        this.content=content;


    }
    public void displayLeaders(){


        Collections.reverse(content);
        System.out.println(content);

        int max=content.get(0);
        System.out.print(max);
        Iterator<Integer> i=content.iterator();
        while(i.hasNext()){
            int current=i.next();
            if(max<current){
                max=current;
                System.out.println(" "+max);

            }

        }

    }

}
