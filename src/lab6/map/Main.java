package lab6.map;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String argv[]){
        HashMap<Integer, String> strings= new HashMap<Integer, String>();

        strings.put(1,"One");
        strings.put(2,"two");
        strings.put(5,"five");
        strings.put(6,"six");
        System.out.println("Cheia 6 are valoarea: "+ strings.get(6));
        for (Map.Entry e: strings.entrySet()){
            System.out.println("key= "+ e.getKey() + "value"+ e.getValue());


        }
    }
}
