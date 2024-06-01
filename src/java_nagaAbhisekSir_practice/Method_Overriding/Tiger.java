package java_nagaAbhisekSir_practice.Method_Overriding;

public class Tiger extends Animal {
    @Override
    void noise() {
        System.out.println("Roaring...");
    }

    @Override
    void eat() {
        System.out.println("Flesh or meat...");
    }

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.name = "Pratyay";
        t.weight = 220;
        System.out.println("Name: " + t.name + "  " + "Weight: " + t.weight + " Kg");
        t.eat();
        t.noise();
    }
}
