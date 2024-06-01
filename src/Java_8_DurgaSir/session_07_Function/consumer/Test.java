package Java_8_DurgaSir.session_07_Function.consumer;

import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {

        Consumer<String> c = s -> System.out.println(s);
        c.accept("Pratyay");
        c.accept("Murari thakur ");
    }
}
