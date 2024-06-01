package Z_ROUGH_CODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeesDetailsExtend {

    public static void main(String[] args) {


        ArrayList<EmployeesDetails> a = new ArrayList<>();
        a.add(new EmployeesDetails("Raju", 18000));
        a.add(new EmployeesDetails("Virat", 15000));
        a.add(new EmployeesDetails("Shyam", 38000));
        a.add(new EmployeesDetails("Pratyay", 28000));
        a.add(new EmployeesDetails("Praveen", 17000));
        a.add(new EmployeesDetails("Tiger", 11000));

        System.out.println("Before Sorting : " + a);

        Comparator<EmployeesDetails> comparator = (e1, e2) -> e1.name.compareTo(e2.name);
        Collections.sort(a, comparator);

        System.out.println("Name Sorting : " + a);

        Comparator<EmployeesDetails> comp = (i1, i2) ->
                (i1.empNo > i2.empNo) ? 1 : (i1.empNo < i2.empNo) ? -1 : 0;

        Collections.sort(a, comp);

        System.out.println("EmpId Sorting : " + a);

    }
}
