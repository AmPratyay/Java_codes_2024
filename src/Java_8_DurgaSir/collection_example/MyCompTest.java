package Java_8_DurgaSir.collection_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyCompTest {

    public static void main(String[] args) {

        // Normal code
       /* ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(10);
        l.add(25);
        l.add(5);
        l.add(0);
        l.add(15);

        System.out.println(l);

        Collections.sort(l, new MyComparator());

        System.out.println(l);*/

        // Use of Lamda expression in Collection concept

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(10);
        l.add(25);
        l.add(5);
        l.add(0);
        l.add(15);

        Comparator<Integer> comp = (i1, i2) -> (i1<i2)?-1:(i1>i2)?+1:0;

        System.out.println(l);

        Collections.sort(l, comp);

        System.out.println(l);

    }
}
