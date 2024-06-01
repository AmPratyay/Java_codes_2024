package Java_8_DurgaSir.session_06_predicate;

import Z_ROUGH_CODE.Predicateex;

import java.util.function.Predicate;

public class predicateExample {

    boolean isPolice;

    public predicateExample(boolean b) {
        this.isPolice = b;
    }

    public static void main(String[] args) {

        Predicate<Integer> p = (a) -> a % 2 == 0;
        System.out.println(p.test(10));
        System.out.println(p.test(15));

        Predicate<Employees> emp = (e) -> e.sal > 10000 && e.haveGf;


        System.out.println(emp.test(new Employees(12000, true)));
        System.out.println(emp.test(new Employees(9000, true)));
        System.out.println(emp.test(new Employees(15000, false)));

        Predicate<predicateExample> pd = (c) -> !c.isPolice;
        System.out.println(pd.test(new predicateExample(true)));
        System.out.println(pd.test(new predicateExample(false)));

        Predicate<String> str = (s) -> s.length() > 5;
        System.out.println(str.test("Pratyay"));
        System.out.println(str.test("Amrit"));

    }
}
