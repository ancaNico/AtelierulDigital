package lab8;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Stream {
    public void ex1(){

    List<String> list= new ArrayList<>(Arrays.asList("Apa","Birou","Claldire"))  ;
        List l=list.stream().map(s->s.charAt(0)).collect(Collectors.toList());
        System.out.println(l);
    }

    public void ex2(){

        List<String> list= new ArrayList<>(Arrays.asList("Apa","Birou","Claldire","Bloc"))  ;
        List l=list.stream().filter(s->s.length()%2 !=0).collect(Collectors.toList());
        System.out.println(list);
    }
    public void ex3(){

        List<String> list= new ArrayList<>(Arrays.asList("Apa","Birou","Claldire"))  ;
        List l=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        // Sau se putea face asa sa trans din min in majjuscule map(s->s.toUpperCase)
        System.out.println(list);
    }
    public static void main(String argv[]){
        Stream s= new Stream();
        s.ex1();
        s.ex2();
        s.ex3();

    }
//git status
    //git add
    //git commit -m
    //git push






}
