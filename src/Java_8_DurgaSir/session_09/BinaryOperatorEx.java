package Java_8_DurgaSir.session_09;

import java.util.function.*;

public class BinaryOperatorEx {

    public static void main(String[] args) {

        BinaryOperator<String> b = (s1, s2) -> s1 + s2;
        System.out.println(b.apply("Pratyay ", "Amrit"));

        // Primitive types of binary operator

        // IntBinaryOperator
        IntBinaryOperator bi = (i1, i2) -> i1 * i2;
        System.out.println(bi.applyAsInt(10, 20));

        // DoubleBinaryOperator
        DoubleBinaryOperator db = (d1, d2) -> d1 * d2;
        System.out.println(db.applyAsDouble(12.34, 43.56));

        //LongBinaryOperator
        LongBinaryOperator lb = (l1, l2) -> l1 * l2;
        System.out.println(lb.applyAsLong(281928291822l, 23456678899l));


    }
}
