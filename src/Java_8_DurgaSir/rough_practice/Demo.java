package Java_8_DurgaSir.rough_practice;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Interif i = (a, b, c) -> System.out.println("Area of " + c.substring(0, 6) + " is  : " + a * a +
                " \nArea of " + c.substring(6, c.length()) + " is  : " + a * b);
        i.SqArea(4, 6, "SquareRectangle");

        Runnable r = () -> {
            for (int j = 0; j < 4; j++) {
                System.out.println("Child thread");
            }
        };

        Thread t = new Thread(r);

        t.start();

        for (int j = 0; j < 4; j++) {
            System.out.println("Main thread");
        }

        Comparator<Integer> c = Integer::compareTo;

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(7);
        a.add(23);
        a.add(15);
        a.add(19);
        a.add(19);

        System.out.println(a);

        Collections.sort(a, c);

        System.out.println(a);

        Comparator<Employees> c1 = Comparator.comparingInt(e -> e.empId);

        ArrayList<Employees> e1 = new ArrayList<>();
        e1.add(new Employees("Pratyay", 16));
        e1.add(new Employees("Ravi", 9));
        e1.add(new Employees("Somu", 12));
        e1.add(new Employees("Tinku", 20));
        e1.add(new Employees("Ajay", 4));

        Collections.sort(e1, c1);

        System.out.println(e1);

        Comparator<Employees> c2 = Comparator.comparing(e3 -> e3.name);

        Collections.sort(e1, c2);

        System.out.println(e1);

        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 15; i++) {
                    System.out.println("Third Child Thread");
                }
            }
        };

        Thread th1 = new Thread(
                () -> {
                    for (int i3 = 1; i3 < 15; i3++) {
                        System.out.println("Child Thread");
                    }
                }
        );

        Thread th = new Thread(() -> {
            for (int i2 = 1; i2 < 15; i2++) {
                System.out.println("Second Child Thread");
            }
        });

        th.start();

        th1.start();

        th2.start();

        for (int i1 = 1; i1 < 15; i1++) {
            System.out.println("Main Thread");
        }

        TreeSet<Integer> t1 = new TreeSet<>();

        t1.add(10);
        t1.add(7);
        t1.add(23);
        t1.add(15);
        t1.add(19);
        t1.add(19);

        System.out.println(t1);
    }

}
