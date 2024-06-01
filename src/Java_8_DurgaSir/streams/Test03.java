package Java_8_DurgaSir.streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Test03 {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(2);
        l.add(15);
        l.add(5);
        l.add(20);

        // forEach(Function) method  : ----

        l.stream().forEach(System.out::println);

        Consumer<Integer> c = i -> System.out.println("Square of " + i + " is : " + (i * i));

        l.stream().forEach(c);

        System.out.println();

        // or

        l.stream().forEach(i -> System.out.println("Square of " + i + " is : " + (i * i)));
    }
}
