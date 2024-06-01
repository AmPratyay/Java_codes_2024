package programming_pathsala.JavaPaidCourse.OOPs_Class2.Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumGenerator {

    List<Integer> nums;

    public void init() {
        nums = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            nums.add(random.nextInt());
            System.out.println("Super Class...................\n " + nums);
        }
    }

    public int get() {
        // some code
        return 0;
    }

}
