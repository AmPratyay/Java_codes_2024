package collections_DurgaSir.List.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo {



    public static void main(String[] args) {

        // HashSet : Insertion order not preserved
        HashSet h = new HashSet();
        h.add("A");
        h.add("M");
        h.add("C");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(" // HashSet : Insertion order is not preserved");
        System.out.println(h);

        // LinkedHashSet : Insertion order not preserved
        LinkedHashSet lh = new LinkedHashSet();
        lh.add("A");
        lh.add("M");
        lh.add("C");
        lh.add("Z");
        lh.add(null);
        lh.add(10);
        System.out.println(h.add("Z"));
        System.out.println(" // LinkedHashSet : Insertion order is preserved");
        System.out.println(lh);
    }
}
