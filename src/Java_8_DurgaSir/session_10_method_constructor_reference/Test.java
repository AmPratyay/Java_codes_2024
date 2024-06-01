package Java_8_DurgaSir.session_10_method_constructor_reference;

public class Test {

    public static void add(int x, int y) {
        System.out.println("The sum is : " + (x + y));
    }

    public static void main(String[] args) {

        Interf i = (a, b) -> System.out.println("The sum is :" + (a + b));
        i.sum(10, 20);

        Interf i1 = Test::add;
        i1.sum(100, 200);
    }
}
