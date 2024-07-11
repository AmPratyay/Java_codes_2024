package Java_8_DurgaSir.rough_practice;

public class Employees {

    String name;

    int empId;

    public Employees(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return empId + " : " + name;
    }
}
