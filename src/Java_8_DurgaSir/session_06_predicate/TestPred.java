package Java_8_DurgaSir.session_06_predicate;

import java.util.function.Predicate;

public class TestPred {

    public static void main(String[] args) {
        String[] strings = {"Ram", "Chiranjivi", "Laxman", "Bala", "Kartika", "Shivam"};

        Predicate<String> s1 = (s2) -> s2.length() > 5;
        for (String s : strings) {
            if (s1.test(s)) {
                System.out.println(s);
            }
        }


        System.out.println("-------------------------------");

        Predicate<String> s3 = (s4) -> s4.length() % 2 == 0;
        for (String s : strings) {
            if (s3.test(s)) {
                System.out.println(s);
            }
        }
    }
}
