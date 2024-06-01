package java_nagaAbhisekSir_practice.type_casting.non_primitive;

public class Test {
    public static void main(String[] args) {

        System.out.println("...UPCASTING...");
        Employees e1 = new Employees();
        Employees e2 = new Employees();
        Bike b1 = new Bike();
        Bike b2 = new Bike();

        // upcating of non-primitive data type
        Object obj[] = {e1,e2,b1,b2};

        System.out.println("Assigning parent class reference to child class \nobject is known as upcasting of non primitie type");
        Object x = obj[0]; // upcasting
        Object y = obj[2]; // upcasting

        // downcasting
        Object x1 = obj[0];
        Employees emp = (Employees) x1;
        emp.work();
        Object y1 = obj[2];
        Bike bk = (Bike) y1;
        bk.ride();

    }
}
