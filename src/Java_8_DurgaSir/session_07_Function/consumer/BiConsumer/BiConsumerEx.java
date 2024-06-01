package Java_8_DurgaSir.session_07_Function.consumer.BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void populate(ArrayList<Employees> l) {
        l.add(new Employees("Durga", 1000));
        l.add(new Employees("Ravi", 2000));
        l.add(new Employees("Sanu", 3000));
        l.add(new Employees("Chinny", 4000));
    }

    public static void main(String[] args) {

        ArrayList<Employees> l = new ArrayList<>();
        populate(l);

        BiConsumer<Employees, Double> c = (e, d) -> e.Salary = (e.Salary + d);

        for (Employees e : l) {
            c.accept(e, 500.0);
        }

        for (Employees e : l) {
            System.out.println("Employee name : " + e.name);
            System.out.println("Employee name : " + e.Salary + "\n");
        }
    }
}
