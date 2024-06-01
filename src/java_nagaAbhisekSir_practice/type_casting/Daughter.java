package java_nagaAbhisekSir_practice.type_casting;

public class Daughter extends Father {

    @Override
    void drink() {
        System.out.println("Horlicks....");
    }

    public static void main(String[] args) {
        Father f = new Son();
        f.drink();
    }
}
