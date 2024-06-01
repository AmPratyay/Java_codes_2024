package java_nagaAbhisekSir_practice.non_primitive;

public class Employees {

    String empName;
    String company;
    int sal;

    public Employees(String n, String c, int s) {
        this.empName = n;
        this.company = c;
        this.sal = s;
    }

    public String toString() {
        return this.empName + "       " + this.company + "        " + this.sal;
    }

    public static void main(String[] args) {
        Employees e1 = new Employees("Rahul   ", "Tcs    ", 25000);
        Employees e2 = new Employees("Dinesh  ", "ITC    ", 35000);
        Employees e3 = new Employees("Sarthak ", "Infosys", 21000);
        Employees e4 = new Employees("jasuriya", "Wipro  ", 29000);

        Employees emp[] = {e1, e2, e3, e4};

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}
