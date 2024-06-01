package Java_8_DurgaSir.session_07_Function.BiFunction;

public class Employee {

    String name;
    int eno;

    public Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return "Employee Number : " + this.name + "\nEmployee number : " + this.eno;
    }
}
