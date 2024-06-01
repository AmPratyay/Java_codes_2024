package java_nagaAbhisekSir_practice.abstraction;

public class Projector extends Switch{


    @Override
    public void switchOn() {
        System.out.println("Switc_On...");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch_off....");
    }

    public static void main(String[] args) {
        Projector p = new Projector();
        p.switchOn();
        p.switchOff();
    }
}
