package java_nagaAbhisekSir_practice.abstraction;

public class Lion extends Animal{
    @Override
    public void eat() {
        System.out.println("Flesh and meat");
    }

    @Override
    public void noise() {
        System.out.println("Roar....");
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        l.name="Simba";
        l.weight=235;
        l.eat();
        l.noise();
    }
}
