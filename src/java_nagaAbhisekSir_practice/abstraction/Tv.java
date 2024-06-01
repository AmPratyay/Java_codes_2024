package java_nagaAbhisekSir_practice.abstraction;

public class Tv extends Switch{
    @Override
    public void switchOn() {
        System.out.println("Switch on....");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off....");
    }

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.switchOn();
        tv.switchOff();
    }
}
