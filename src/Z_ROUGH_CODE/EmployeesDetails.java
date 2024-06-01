package Z_ROUGH_CODE;

public class EmployeesDetails {

    public String name;
    public int empNo;

    public EmployeesDetails(String name, int empNo) {
        this.name = name;
        this.empNo = empNo;
    }

    public String toString() {
        return empNo + " : " + name;
    }

}
