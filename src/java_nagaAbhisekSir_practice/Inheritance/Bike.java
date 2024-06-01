package java_nagaAbhisekSir_practice.Inheritance;

public class Bike extends Vehicle{

    @Override
    void startEngine(){
        super.startEngine();
        System.out.println("ok.......");
    }
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.name="Honda-Gixer";
        b1.price=560000;
        System.out.println(b1.name+"  "+b1.price);
        b1.startEngine();
        b1.stopEngine();
    }
}
