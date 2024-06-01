package Java_8_DurgaSir.DateAndTimeApi;

import java.time.Year;
import java.util.Scanner;

public class LeapYr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year number : ");

        int n = sc.nextInt();

        Year y = Year.of(n);

        if (y.isLeap())
            System.out.printf("%d is a Leap year ", n);
        else
            System.out.printf("%d is not a Leap year", n);
    }
}
