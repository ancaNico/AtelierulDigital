package lab9;
import reactor.core.publisher.Mono;

public class Challenge2 {

    private Mono<String> emptyMono(){
        return Mono.empty();

    }

    private Mono<String> fooMono(){
        return Mono.just("foo");

    }

    public static void main (String argv[]){
        Challenge2 ch=new Challenge2();
        ch.emptyMono().subscribe(System.out::println);

        ch.fooMono().subscribe(System.out::println);



    }
}
