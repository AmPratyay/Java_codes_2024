package java_nagaAbhisekSir_practice.non_primitive.Heterogeneous_array;

public class Test {

    public static void main(String[] args) {
        Bike b1 = new Bike("Honda", 120000);
        Bike b2 = new Bike("Yamaha", 150000);
        Employees e1 = new Employees("Rahul", 34000);
        Employees e2 = new Employees("Raman", 56000);

        Object obj[] = {b1, b2, e1, e2};

        for (int i = 0; i <= obj.length - 1; i++) {
            System.out.println(obj[i]);
        }
    }
}
