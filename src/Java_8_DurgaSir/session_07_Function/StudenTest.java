package Java_8_DurgaSir.session_07_Function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudenTest {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Durga", 100),
                new Student("Sunny", 65),
                new Student("Bunny", 55),
                new Student("Chunny", 45),
                new Student("Munny", 25)
        };

        Function<Student, String> f =
                s -> s.marks >= 80 ? "A : [ Dictinction ]" : s.marks >= 60 ? "B [ First Class ]" :
                        s.marks >= 50 ? "C [ Second Class ]" : s.marks >= 35 ? "D [ Third Class ]" : "E [ FAIL ]";

        Predicate<Student> pd = s2 -> s2.marks >= 60;

        Consumer<Student> s = s4-> {
            System.out.println("Student Name : " + s4.name);
            System.out.println("Student Marks : " + s4.marks);
            System.out.println("Grade Obtained : " + f.apply(s4));
            System.out.println();
        };


        for (Student ss : students) {
            if (pd.test(ss)) {
                s.accept(ss);
            }
        }
    }
}
