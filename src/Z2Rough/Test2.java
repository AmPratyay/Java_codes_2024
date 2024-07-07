package Z2Rough;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        /*// -- Iterator  -----
        System.out.println(" ===========  Iterator  ============= ");

        ArrayList l = new ArrayList();
        l.add("Pratyay");
        l.add("Amrit");
        l.add("Pranay");
        l.add("Pushp");
        System.out.println("==Starting== " + l);
        Iterator itr = l.iterator();

        while (itr.hasNext()) {
            String str = (String) itr.next();
            if (str.length() >= 6) {
                System.out.println(str);
            } else {
                itr.remove();
            }
        }
        System.out.println("==Ending== " + l);


        System.out.println(" ===========  ListIterator  ============= ");


        ArrayList a = new ArrayList();
        for (int i = 10; i > 0; i--)
            a.add(i);
        System.out.println(" === Initial Values === " + a);
        ListIterator li = a.listIterator();
        while (li.hasNext()) {
            Integer in = (Integer) li.next();
            System.out.println(in);
        }

        while (li.hasPrevious()) {
            Integer intg = (Integer) li.previous();
            System.out.println(intg);
        }

        HashSet s = new HashSet();


        // -- TREE SET

        System.out.println(" ===========  TREE SET  ============= ");
        TreeSet t = new TreeSet();
        try {
            t.add("Z");
            t.add("X");
            t.add("B");
            t.add("D");
            t.add("K");
            t.add("C");

            t.add(null);
        } catch (Exception e) {
            System.out.println("Heterogeneous objects not allowed : " + e);
        }

        System.out.println("TREE SET == : " + t);

        // String Builder also implements comparable after jdk-11

        TreeSet ts = new TreeSet();
        ts.add(new StringBuffer("C"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("M"));
        System.out.println(ts);

        // === COMPARABLE ===

        System.out.println("B".compareTo("A"));*/

        TreeMap tm = new TreeMap(new MyComparatorString());
        tm.put("Raman",12);
        tm.put("Chaman",10);
        tm.put("Daman",17);
        tm.put("Aaman",14);
        tm.put("Saman",15);

        System.out.println(tm);

        PriorityQueue q = new PriorityQueue();
        q.offer(12);
        q.offer(18);

        System.out.println(q.poll());

        System.out.println(q);


    }
}
