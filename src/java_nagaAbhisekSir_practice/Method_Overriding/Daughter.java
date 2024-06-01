package java_nagaAbhisekSir_practice.Method_Overriding;

public class Daughter extends Father {

    @Override
    void drink() {
        System.out.println("Horlicks");
    }

    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.drink();

    }
}
