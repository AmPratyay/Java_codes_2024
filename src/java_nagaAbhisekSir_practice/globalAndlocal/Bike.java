package java_nagaAbhisekSir_practice.globalAndlocal;

public class Bike {

    String name = "Honda";

    void startEng(){
        System.out.println("started .....");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.name);
        b.startEng();
    }
}
