package Java_8_DurgaSir.session_09;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx {

    public static void main(String[] args) {

        UnaryOperator<Integer> f = i -> i * i;
        System.out.println(f.apply(6));

        // Types of UnaryOperator
        // IntUnaryOperator

        IntUnaryOperator fi = i -> i * i;
        System.out.println(fi.applyAsInt(8));

        //DoubleUnaryOperator

        DoubleUnaryOperator fd = i -> (i / 50) * 100;
        System.out.println(fd.applyAsDouble(45.3));

    }
}
