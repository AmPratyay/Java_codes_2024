package java_nagaAbhisekSir_practice.type_casting.primitive;

public class Test {

    public static void main(String[] args) {

        //Data widening --> Implicit casting
        System.out.println("Data widening --> Implicit casting");
        System.out.println();
        byte b = 12;
        short s = b;
        System.out.println(s);
        int i = s;
        System.out.println(i);
        long l = i;
        System.out.println(i);
        //int i2 = l;  //error -->

        //Data narrowing --> explicit casting
        System.out.println("Data narrowing --> explicit casting");

        byte b1 = 23;
        byte b2 = 43;
        short s1 = 456;
        int i2 = 2344;
        long l1 = 43999322l;

        int in[] = {b1, b2, s1, i2, (int) l1};

        for (int a = 0; a < in.length; a++) {
            System.out.println(in[a]);
        }

        // Data loss int data narrowing (explicit casting)

        int i3 = 257;
        byte b3 = (byte) i3;
        System.out.println(b3);

    }
}
