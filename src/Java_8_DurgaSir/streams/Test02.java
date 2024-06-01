package Java_8_DurgaSir.streams;

import java.util.ArrayList;

public class Test02 {

    public static void main(String[] args) {

        // min(Comparator) and max(Comparator)

        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(2);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println(l);

        Integer i = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Min : " + i);

        Integer i3 = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("Max : " + i3);

        Integer i4 = l.stream().min((i1, i2) -> i2.compareTo(i1)).get();
        System.out.println("Min : " + i4);

        Integer i5 = l.stream().max((i1, i2) -> i2.compareTo(i1)).get();
        System.out.println("Max : " + i5);

        Integer i6 = l.stream().min((i1, i2) -> -i2.compareTo(i1)).get();
        System.out.println("Min : " + i4);

        Integer i7 = l.stream().max((i1, i2) -> -i2.compareTo(i1)).get();
        System.out.println("Max : " + i5);


    }
}
