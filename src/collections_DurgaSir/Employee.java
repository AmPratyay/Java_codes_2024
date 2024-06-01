package collections_DurgaSir;

import java_nagaAbhisekSir_practice.type_casting.non_primitive.Employees;

public class Employee {

    String eName;
    int empId;

    public Employee(String eName, int empId) {
        this.eName = eName;
        this.empId = empId;
    }

    public String toString() {
        return "Name : " + eName + " Emp_Id : " + empId;
    }


}
