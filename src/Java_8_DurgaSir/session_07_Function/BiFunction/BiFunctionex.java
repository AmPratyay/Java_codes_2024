package Java_8_DurgaSir.session_07_Function.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionex {

    public static void main(String[] args) {

        BiFunction<String, Integer, Employee> f = (name, eno) -> new Employee(name, eno);
        Employee e = f.apply("Pratyay", 12);
        System.out.println(e + "\n");

        ArrayList<Employee> l = new ArrayList<>();
        l.add(f.apply("Durga", 100));
        l.add(f.apply("Shiva", 200));
        l.add(f.apply("Ravi", 300));
        l.add(f.apply("Sonu", 400));

        for (Employee emp : l) {
            System.out.println(emp + "\n");
        }
    }
}
