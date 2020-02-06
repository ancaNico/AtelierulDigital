package lab8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class Challenge1 {
    @Test
    public void consumer_1(){
        List<String> list= new ArrayList<>(Arrays.asList("a","b","c"));
        Consumer<List<String>> consumer=List :: clear;
        consumer.accept(list);
        Assert.assertEquals(list, new ArrayList<>());

    }



   @Test
    public void consumer_2(){
       List<String> list= new ArrayList<>(Arrays.asList("a","b","c"));
       List<String> list2= new ArrayList<>(Arrays.asList("a","b","c","first","second"));
       Consumer<List<String>> c2= l->l.add("first");
       Consumer<List<String>> c3= l->l.add("second");

       Consumer<List<String>> consumer= (l)->
           c2.andThen(c3).accept(l);
            //Varianta 2
           // c2.accept(l);
           //  c3.accept(l);};

           consumer.accept(list);

        Assert.assertEquals(list,list2);
       }
}


