package lab6.leaders;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String argv[]){

        List content= new ArrayList();
        content.add(9);
        content.add(5);
        content.add(3);
        content.add(1);
        System.out.println(content);
        Leaders leaders= new Leaders(content);
        leaders.displayLeaders();


        List<Container> genericContent=new ArrayList<Container>();
        genericContent.add(new Container(3.4f));
        genericContent.add(new Container(5.0f));
        genericContent.add(new Container(3.9f));
        genericContent.add(new Container(1.0f));
        System.out.println();

        GenericLeaders<Container> gLeaders= new GenericLeaders<Container>(genericContent);
        gLeaders.displayLeaders();


    }
}
