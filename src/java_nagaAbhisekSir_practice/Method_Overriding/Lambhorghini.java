package java_nagaAbhisekSir_practice.Method_Overriding;

public class Lambhorghini extends Car {

    @Override
    void topSpeed() {
        System.out.println("250-300 kmph..");
    }

    public static void main(String[] args) {
        Lambhorghini l1 = new Lambhorghini();
        l1.topSpeed();
        l1.startEng();
        l1.stopEngine();
    }
}
