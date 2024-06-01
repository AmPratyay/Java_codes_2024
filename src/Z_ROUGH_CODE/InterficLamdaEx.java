package Z_ROUGH_CODE;

import Java_8_DurgaSir.Interf;

import java.util.Collections;

public class InterficLamdaEx {

    public static void main(String[] args) {
        Interfic i = (a, b) -> System.out.println("Sum :" + (a + b));
        i.sum(10, 15);

        Interfic i2 = (a, b) -> {
            boolean flag = false;
            if (a % 2 == 0  ) {
                System.out.println("First input is even no : " + a);
            } else if (b % 2 == 0) {
                flag = true;
                System.out.println("Second input is even no : " + b);
            } else {
                System.out.println("First input is odd no : " + a);
            }

            System.out.println("Sum :" + (a + b));
        };

        i2.sum(14, 15);
    }
}
