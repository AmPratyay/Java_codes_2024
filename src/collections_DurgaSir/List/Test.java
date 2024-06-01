package collections_DurgaSir.List;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    // Enumeration

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for(int i = 0 ; i<=10 ; i++){
            v.addElement(i);
        }

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            int i = (int) e.nextElement();
            if(i%2==0)
                System.out.println(i);
        }
    }
}
