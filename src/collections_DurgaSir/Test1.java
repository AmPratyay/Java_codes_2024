package collections_DurgaSir;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        // ListIterator

       /* ArrayList al = new ArrayList();
        for (int i = 0; i <= 20; i++) {
            al.add(i);
        }
        System.out.println("Raw data : "+al);

        ListIterator list = al.listIterator();

        while(list.hasNext()){
            Integer i = (Integer) list.next();
            if(i<11 && i%2==0)
                System.out.println(i);
            else if (i>10 && i%2==0) {
                list.set("Even > 10 : "+i);
            } else if (i>11) {
                System.out.println("Odd : "+i);
            }
            else
                list.remove();

        }

        System.out.println(" After process : "+al);*/


        Vector v = new Vector();

        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator listIterator = v.listIterator();

        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(listIterator.getClass().getName());
    }
}
