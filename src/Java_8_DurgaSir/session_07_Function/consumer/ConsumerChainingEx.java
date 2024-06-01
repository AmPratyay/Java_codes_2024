package Java_8_DurgaSir.session_07_Function.consumer;

import java.util.function.Consumer;

public class ConsumerChainingEx {

    public static void main(String[] args) {

        Consumer<Movie> c1 = c -> System.out.println(c.movieName + " is ready for release");
        Consumer<Movie> c2 = c -> System.out.println(c.movieName + " is super flop movie ");
        Consumer<Movie> c3 = c -> System.out.println(c.movieName + " is saving into flop movie database");

        Movie m = new Movie("Spider");
        c1.andThen(c2).andThen(c3).accept(m);
        // c1.accept(m);
    }
}
