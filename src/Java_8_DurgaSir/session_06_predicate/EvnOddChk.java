package Java_8_DurgaSir.session_06_predicate;

import Z_ROUGH_CODE.Interfic;
import Z_ROUGH_CODE.Predicateex;

import java.util.function.Predicate;

public class EvnOddChk {

    public static void main(String[] args) {

        int[] in = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80};

        Predicate<Integer> p = a -> a % 2 == 0;

        Predicate<Integer> p1 = a1 -> a1 < 35;

        for (Integer i : in) {
            if (p1.negate().and(p).test(i))
                System.out.println("Even : " + i);
            else if (p1.negate().and(p.negate()).test(i))
                System.out.println("Odd : " + i);
        }
    }
}
