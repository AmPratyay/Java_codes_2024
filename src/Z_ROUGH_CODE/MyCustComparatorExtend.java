package Z_ROUGH_CODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyCustComparatorExtend /*extends MyCustComparator*/ {

    public static void main(String[] args) {

        // Normal Code

        /*MyCustComparator m = new MyCustComparatorExtend();

        ArrayList<Integer> al = new ArrayList<>();
        al.add(19);
        al.add(14);
        al.add(29);
        al.add(49);
        al.add(9);
        al.add(27);
        al.add(67);

        System.out.println("Before sorting : " + al);

        Collections.sort(al, m);

        System.out.println("After sorting : " + al);*/


        // Lamda code

        ArrayList<Integer> al = new ArrayList<>();
        al.add(19);
        al.add(14);
        al.add(29);
        al.add(49);
        al.add(9);
        al.add(27);
        al.add(67);

        System.out.println("Before sorting : " + al);

        Comparator<Integer> comp = (a, b) -> {
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            } else {
                return 0;
            }
        };

        Collections.sort(al, comp);

        System.out.println("After Sorting : " + al);

    }
}
