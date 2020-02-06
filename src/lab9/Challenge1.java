package lab9;
import reactor.core.publisher.Flux;// mai intai o adaugi in program din file->project structures->libraries->+ si cauti dupa reactor-core

import java.time.Duration;


public class Challenge1 {
    private Flux<String> emptyFlux() {
        return Flux.empty();

    }
    private Flux<String> fooBarFlux() {
        return Flux.just("foo","bar");

    }

    private Flux<Integer> intervalFlux(int i, int j) {
        return Flux.interval(Duration.ofMillis(100))
                .elapsed()
                .range(i,j);

    }

    public static void main(String argv[]) {
        Challenge1 ch = new Challenge1();
        ch.emptyFlux().subscribe(t -> System.out.println(t));


        System.out.println("foo bar flux:");
        ch.fooBarFlux().subscribe(t -> System.out.println(t));

        System.out.println("intervalFlux result:");
        ch.intervalFlux(0,9).subscribe(t->System.out.println(t));

    }

}
