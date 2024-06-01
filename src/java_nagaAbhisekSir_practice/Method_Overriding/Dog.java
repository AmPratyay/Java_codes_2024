package java_nagaAbhisekSir_practice.Method_Overriding;

public class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Meat and Roti..");
    }

    @Override
    void noise() {
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Shiroo";
        d.weight = 35;
        System.out.println("Name: " + d.name + "  " + "Weight: " + d.weight + " Kg");
        d.eat();
        d.noise();
    }
}
