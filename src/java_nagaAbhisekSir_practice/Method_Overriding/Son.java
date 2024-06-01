package java_nagaAbhisekSir_practice.Method_Overriding;

public class Son extends Father {

    @Override
    void drink() {
        System.out.println("Tea");
    }

    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.money);
        s.exercise();
        s.drink();
        Father f = new Father();
        f.drink();
        Father f1 = new Son();
        f1.drink();
    }
}
