package Java_8_DurgaSir.DateAndTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class Test01 {

    public static void main(String[] args) {

        LocalDate l = LocalDate.of(1998+60,12,1);

        Period p = Period.between(l,LocalDate.now());

        System.out.println(p.getYears());
    }
}
