package Java_8_DurgaSir.session_07_Function;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        Function<Integer, Integer> f = i -> i * i;

        System.out.println(f.apply(4));

        System.out.println(f.apply(5));

        // String as argument and will return length of String

        Function<String, Integer> f1 = a -> a.length();

        System.out.println(f1.apply("Pratyay"));

        Function<String, String> f2 = a -> a.toUpperCase();

        System.out.println(f2.apply("pratyay amrit"));
    }
}
