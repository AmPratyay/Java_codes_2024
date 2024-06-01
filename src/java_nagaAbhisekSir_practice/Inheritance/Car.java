package java_nagaAbhisekSir_practice.Inheritance;

public class Car extends Vehicle{

    public static void main(String[] args) {
        Car c = new Car();
        c.name="TATA-HARRIER";
        c.price= 980000;
        System.out.println(c.name+"  "+c.price);
        c.startEngine();
        c.stopEngine();
    }
}
