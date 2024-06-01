package java_nagaAbhisekSir_practice.Constructor_chaining.this_keyword;

public class Son {

    public Son() {
        this(11);
        System.out.println("Z_ROUGH_CODE.Son");
    }

    Son(int x) {
        System.out.println("Z_ROUGH_CODE.Son.....1");
    }

    public static void main(String[] args) {
        new Son(11);
    }
}
