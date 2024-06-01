package java_nagaAbhisekSir_practice.abstraction.using_interface;

public class Son implements Father,Mother{
    @Override
    public void care() {
        System.out.println("Father and Mother cares");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.care();
    }
}
