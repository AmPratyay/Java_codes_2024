package collections_DurgaSir.List.cursors;

import java.util.*;

public class Demo {


    public static void main(String[] args) {

        System.out.println(" ------- Enumeration : -----------");

        Vector v = new Vector();

        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }

        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        System.out.println(" ------- Iterator : -----------");

        ArrayList al = new ArrayList();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }

        System.out.println(al);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Integer in = (Integer) itr.next();
            if (in % 2 == 0) {
                System.out.println("Even no : " + in);
            } else {
                System.out.println("Elements removed : " + in);
                itr.remove();
            }
        }
        System.out.println(al);

        System.out.println(" ------- List Iterator : -----------");

        ArrayList l = new ArrayList();
        ArrayList removed = new ArrayList();
        ArrayList added = new ArrayList();
        ArrayList seted = new ArrayList();
        for (int i = 0; i < 20; i++) {
            l.add(i);
        }
        ListIterator list = l.listIterator();

        while (list.hasNext()) {
            Integer i = (Integer) list.next();
            if (i % 2 == 0 && i <= 10) {
                removed.add(i);
                list.remove();
            } else if (i % 2 == 0) {
                added.add(i);
                list.add("pratyay");
            } else {
                seted.add(i);
                list.set("Amrit");
            }
        }
        System.out.println("Final output : " + l);
        System.out.println("Removed operation on : " + removed);
        System.out.println("Add operation on : " + added);
        System.out.println("Set operation on : " + seted);

        ArrayList all = new ArrayList();
        for (int i = 0; i < 10; i++) {
            all.add(i);
        }
    }
}
