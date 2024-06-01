package Java_8_DurgaSir;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

    // Normal way of writing code (before Java 8)
    public static int squareIt(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println("Square of 4 : " + squareIt(4));
        System.out.println("Square of 5 : " + squareIt(5));

        //OR

        Function<Integer, Integer> f = i -> i * i;

        System.out.println("Square of 6 : " + f.apply(6));
        System.out.println("Square of 8 : " + f.apply(8));

        Predicate<Integer> p = i -> i % 2 == 0;

        for (int i = 3; i <= 6; i++) {
            if (p.test(i) == true)
                System.out.println(i + "  is Even Number ");
            else
                System.out.println(i + " is odd number ");

        }
    }


}
