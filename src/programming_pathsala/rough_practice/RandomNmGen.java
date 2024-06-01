package programming_pathsala.rough_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNmGen {

    List<Integer> num;

    public void init() {
        num = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            num.add(random.nextInt());
        }
    }

    public List<Integer> get(){
        return num;
    }
}
