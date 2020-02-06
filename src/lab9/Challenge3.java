package lab9;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
public class Challenge3 {

    private static List<String> words= Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jmped",
            "over",
            "the",
            "lazy",
            "dog"


    );
    static void displayLetters(){
        Flux.fromIterable(words)
                .map(word -> word.charAt(0))
                .subscribe(System.out::println);

    }
    public static void main(String argv[]){
        displayLetters();



    }
}
