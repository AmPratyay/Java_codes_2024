package Z_ROUGH_CODE;

import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

public class Predicateex {

    public static void main(String[] args) {

         Predicate<Integer> p = a -> a % 2 == 0;
        System.out.println(p.test(12));
    }
}
