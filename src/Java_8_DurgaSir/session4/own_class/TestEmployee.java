package Java_8_DurgaSir.session4.own_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {

    public static void main(String[] args) {

        ArrayList<Employee> alist = new ArrayList<>();
        alist.add(new Employee("Durga", 12246));
        alist.add(new Employee("Raman", 52256));
        alist.add(new Employee("Sarvesh", 51446));
        alist.add(new Employee("Raina", 45627));
        alist.add(new Employee("Shikhar", 23485));

        System.out.println(alist);

        // Sorting based on employee no

        Comparator<Employee> compEmp = (a, b) -> (a.eno < b.eno) ? -1 : (a.eno > b.eno) ? 1 : 0;
        Collections.sort(alist, compEmp);

        System.out.println(alist);

        // Sorting based on employee name

        Comparator<Employee> comp = (e1, e2) -> (e1.name.compareTo(e2.name));

        Collections.sort(alist, comp);

        System.out.println(alist);


        // Anonymous inner class

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        Thread t = new Thread(r);
        t.start();


    }
}
