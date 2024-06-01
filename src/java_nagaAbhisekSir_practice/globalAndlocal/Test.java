package java_nagaAbhisekSir_practice.globalAndlocal;

import java.util.Arrays;

public class Test {

    String x;

    public void details(){
        x = "Pratyay";
        String x = "Amrit";

        // Local variable dominates over global variable
        System.out.println(x);

        // To print Global variable over Local variable ,
        // we will use Variable shadowing using this keyword
        System.out.println(this.x);

    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.details();
        Bike b = new Bike();
        System.out.println(b.name);
        b.startEng();

        System.out.printf("anbsb");
        System.out.println("Test.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("b = " + b);
    }
}
