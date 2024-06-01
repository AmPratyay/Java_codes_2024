package Java_8_DurgaSir.session_06_predicate;

import Z_ROUGH_CODE.Predicateex;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestWorker {

    public static void main(String[] args) {

        ArrayList<Worker> l = new ArrayList<>();
        l.add(new Worker("Pratyay", 1000));
        l.add(new Worker("Raman", 2000));
        l.add(new Worker("Ajay", 3000));
        l.add(new Worker("Vijay", 4000));
        l.add(new Worker("Satish", 5000));
        l.add(new Worker("Pawan", 6000));

        Predicate<Worker> p = w -> w.salary > 3000;

        for (Worker worker : l) {
            if (p.test(worker)) {
                System.out.println(worker.name + " : " + worker.salary);
            }
        }
    }
}
