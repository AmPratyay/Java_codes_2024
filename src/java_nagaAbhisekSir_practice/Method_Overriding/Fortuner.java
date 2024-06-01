package java_nagaAbhisekSir_practice.Method_Overriding;

public class Fortuner extends Car {

    @Override
    void topSpeed() {
        System.out.println("180-200 kmph..");
    }

    public static void main(String[] args) {
        Fortuner f1 = new Fortuner();
        f1.topSpeed();
        f1.startEng();
        f1.stopEngine();
    }
}
