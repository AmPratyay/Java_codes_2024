package collections_DurgaSir;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Demo {

    public static void main(String[] args) {

        System.out.println(" --------  : Array List :  --------         ");

        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("R");
        l.add("V");

        ArrayList l1 = new ArrayList();
        l1.add("Z");
        l1.add("R");
        l1.add("V");

        ArrayList al = new ArrayList();
        al.add("A");
        al.add(10);
        al.add(null);
        al.add("A");
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add(2, "M");
        System.out.println(al);
        al.add("N");
        System.out.println(al);
        al.add(l);
        System.out.println(al);
        al.addAll(l);
        System.out.println(al);

        al.addAll(4, l1);
        System.out.println(al);

        System.out.println(al.get(al.size() - 1));

        System.out.println(al.remove(8));
        System.out.println(al);

        System.out.println(al.indexOf("A"));

        System.out.println(" --------  : Linked List :  --------         ");

        LinkedList ll = new LinkedList();
        ll.add("durga");
        ll.add(30);
        ll.add(null);
        ll.add("durga");
        ll.set(0, "Sir");
        ll.add("software");
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.addFirst("Pratyay");
        System.out.println(ll);
        ll.addLast("Amrit");
        System.out.println(ll);

        System.out.println(" --------  : Vector :  --------         ");

        Vector v = new Vector(10, 5);

        for (int i = 1; i < 11; i++) {
            v.addElement(i);
        }

        System.out.println(v);

        System.out.println("Capacity : " + v.capacity());

        v.addElement("M");

        System.out.println(v + "\n" + "Capacity : " + v.capacity());

        System.out.println(v.elementAt(4));
        System.out.println(v.firstElement() + "\n" + v.lastElement());


        System.out.println(" --------  : Stack :  --------         ");

        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.push("Murari"));
        System.out.println(s);
        System.out.println(s.peek());

        System.out.println("Offset : "+s.search("A"));
        s.clear();
        System.out.println(s);
        System.out.println(s.empty());

    }
}
