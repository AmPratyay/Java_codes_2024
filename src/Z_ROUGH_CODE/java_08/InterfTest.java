package Z_ROUGH_CODE.java_08;

import Java_8_DurgaSir.session_10_method_constructor_reference.Interf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InterfTest {

    public static void main(String[] args) {

        Interf i = (a, b) -> System.out.println("Sum : " + (a + b));
        i.sum(23, 45);

        InterfSq is = a -> System.out.println("Square of " + a + " is :" + a * a);
        is.squateIt(6);

        Runnable r = () -> {
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.println("Child Thread ... ");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for (int i2 = 0; i2 < 10; i2++) {
            System.out.println("Main Thread ... ");
        }

        ArrayList<Integer> l = new ArrayList<>();
        l.add(30);
        l.add(20);
        l.add(35);
        l.add(22);
        l.add(9);

        System.out.println("Before Sorting " + l);

        Comparator<Integer> c = (a1, a2) ->
                a1 < a2 ? -1 : a1 > a2 ? 1 : 0;

        Collections.sort(l, c);

        System.out.println("After Sorting : " + l);
    }
}
