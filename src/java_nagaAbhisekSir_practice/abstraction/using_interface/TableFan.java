package java_nagaAbhisekSir_practice.abstraction.using_interface;

public class TableFan extends Fan {

    @Override
    public void incSpeed() {
        System.out.println("Fan speed inc");
    }

    @Override
    public void decSpeed() {
        System.out.println("Fan speed dec");
    }

    @Override
    public void switchOn() {
        System.out.println("Fan-on");
    }

    @Override
    public void switchOff() {
        System.out.println("Fan off");
    }
}
