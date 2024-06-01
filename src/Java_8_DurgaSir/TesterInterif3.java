package Java_8_DurgaSir;

public class TesterInterif3 {

    public static void main(String[] args) {
        Interif3 i = n -> n * n;

        System.out.println(i.squareIt(4));
    }

}
