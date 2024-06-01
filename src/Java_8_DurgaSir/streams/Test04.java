package Java_8_DurgaSir.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test04 {

    public static void main(String[] args) {

        // Streams to Array

        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(3);
        l.add(25);
        l.add(15);

        System.out.println(l);

        Integer[] i1 = l.stream().toArray(Integer[]::new);

        for (Integer i2 : i1) {
            System.out.println(i2);
        }

        // OR

        System.out.println();

        Stream.of(i1).forEach(System.out::println);


    }
}
