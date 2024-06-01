package Z2Rough;

import java.util.Scanner;

public class VehicleTest {


    public static void print(Vehicle obj) {

        if (obj instanceof Car) {
            obj.move();
        } else if (obj instanceof Bike) {
            obj.move();
        } else if (obj instanceof Cycle) {
            obj.move();
        } else {
            System.out.println("No Matching Object");
        }


    }

    public static void main(String[] args) {
        Vehicle v = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Name : ");

        String str = sc.next();

        if (str.equalsIgnoreCase("car")) {
            v = new Car();
        } else if (str.equalsIgnoreCase("cycle")) {
            v = new Cycle();
        } else if (str.equalsIgnoreCase("Bike")) {
            v = new Bike();
        } else {
            System.out.println("No matching value : " + str);
            System.out.println("Exiting the code");
            System.exit(100);
        }

        print(v);

        Vehicle v2 = () -> System.out.println("Move the anoan veh ");
        v2.move();

    }
}
