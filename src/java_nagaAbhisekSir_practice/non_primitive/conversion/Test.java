package java_nagaAbhisekSir_practice.non_primitive.conversion;

public class Test {

    public static void main(String[] args) {
        byte bt = 4;
        short s = 32;
        int i = 345;
        long l = 4521l;

        float f = 32.40f;
        double d = 543.875;

        char c = 'A';
        boolean b = true;


        Object obj[] = {bt, s, i, l, f, d, c, b};
        for (int a = 0; a < obj.length; a++) {
            System.out.println(obj[a]);
        }
    }
}
