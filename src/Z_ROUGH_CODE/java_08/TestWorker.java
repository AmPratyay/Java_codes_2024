package Z_ROUGH_CODE.java_08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestWorker {

    public static void main(String[] args) {

        ArrayList<Worker> al = new ArrayList<>();

        al.add(new Worker("Pratyay", 10054));
        al.add(new Worker("Arjun", 30054));
        al.add(new Worker("Shubham", 20153));
        al.add(new Worker("Raju", 15054));
        al.add(new Worker("Chaitanya", 60151));
        al.add(new Worker("Jaiyesh", 50054));

        System.out.println(al);

        Comparator<Worker> c = (a, b) -> a.workerId > b.workerId ? -1 : a.workerId < b.workerId ? 1 : 0;

        Collections.sort(al, c);

        System.out.println(al);

        Comparator<Worker> comp = (d, e) -> d.workerName.compareTo(e.workerName);

        Collections.sort(al, comp);

        System.out.println(al);
    }
}
