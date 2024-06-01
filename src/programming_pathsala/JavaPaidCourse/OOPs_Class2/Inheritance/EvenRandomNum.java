package programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class EvenRandomNum extends RandomNumGenerator {

    List<Integer> evenNums = new ArrayList<>();

    public void init() {
        super.init();
        List<Integer> temp = super.nums;

        System.out.println("Child class>>>>>>>>>>>>>>>>\n");
        for (Integer i : temp)
            if (i % 2 == 0) {
                evenNums.add(i);
                System.out.println(evenNums);
            }

    }

}
