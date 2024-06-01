package Java_8_DurgaSir.DateAndTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalTime time = LocalTime.now();

        System.out.println("Date : " + date + " and Time is " + time);

        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();

        System.out.println(dd + " " + date.getMonth() + " " + yyyy);

        System.out.printf("%d-%d-%d", dd, mm, yyyy);

        System.out.println();

        int hh = time.getHour();
        int mi = time.getMinute();
        int ss = time.getSecond();
        int ns = time.getNano();

        System.out.printf("%d : %d : %d : %d ", hh, mi, ss, ns);

        // LocalDateTime class

        LocalDateTime l = LocalDateTime.now();
        System.out.println(l);

    }
}
