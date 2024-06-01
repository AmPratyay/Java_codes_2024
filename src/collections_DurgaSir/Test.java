package collections_DurgaSir;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        // Iterator

        ArrayList al = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            al.add(i);
        }

        System.out.println("Before Removal : " + al);

        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();

            if (i % 2 == 0)
                System.out.println(i);
            else
                itr.remove();
        }
        System.out.println("After Removal : " + al);
    }
}
