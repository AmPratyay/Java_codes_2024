package Java_8_DurgaSir.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        // .filer method
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);

        System.out.println(l);

        List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(l2);

        // .map method

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(40);
        marks.add(65);
        marks.add(10);
        marks.add(15);
        marks.add(35);
        marks.add(75);
        System.out.println("Marks before grace : " + marks);

        List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());

        System.out.println("Marks after grace : " + updatedMarks);

        //------> count method

        long noOfFailedStudent = marks.stream().filter(i -> i < 35).count();

        System.out.println("Number of failed students is/are : " + noOfFailedStudent);

        // sorted method --> sorted according to default sorting order

        List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorted List : " + sortedList);

        List<Integer> sortedListWithGrace = updatedMarks.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list with grace : " + sortedListWithGrace);

        // sorted method --> sorted according to customized  sorting order

        List<Integer> customSorted =
                marks.stream().sorted((i1, i2) -> i1 < i2 ? 1 : i1 > i2 ? -1 : 0).collect(Collectors.toList());

        System.out.println("Default Sorted List : " + customSorted);
    }
}
