package java_nagaAbhisekSir_practice.abstraction;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Meat and roti");
    }

    @Override
    public void noise() {
        System.out.println("bark");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.name="shreoo";
        d.weight=25;
        d.eat();
        d.noise();
    }
}
