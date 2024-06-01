package java_nagaAbhisekSir_practice.Constructor_chaining;

public class Son extends Father {

    public Son() {
        System.out.println("Z_ROUGH_CODE.Son");
    }

    Son(int x) {
        super(2);
        System.out.println("Z_ROUGH_CODE.Son.....1");
    }

    public static void main(String[] args) {
        new Son();
        new Son(3);
        System.out.println(new Son());
    }
}
