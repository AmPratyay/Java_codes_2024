package Java_8_DurgaSir.session4.own_class;

public class Employee {

    public String name;
    public int eno;

    public Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    public String toString() {
        return eno + ":" + name;
    }
}
