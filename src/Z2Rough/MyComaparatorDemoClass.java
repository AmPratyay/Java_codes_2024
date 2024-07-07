package Z2Rough;

import java.util.TreeSet;

public class MyComaparatorDemoClass {

    public static void main(String[] args) {

        /*TreeSet t = new TreeSet(new MyComaparator12());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);

        System.out.println(t);*/

        TreeSet ts = new TreeSet(new MyComparatorString());
        ts.add("Axe");
        ts.add("Cat");
        ts.add("Ox");
        ts.add(new StringBuffer("Tiger"));
        ts.add("Dog");
        ts.add("Horse");
        ts.add(new StringBuffer("A"));
        ts.add("Lion");
        ts.add(new StringBuffer("Dinasour"));
        ts.add(12);

        System.out.println(ts);

    }
}
