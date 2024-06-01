package java_nagaAbhisekSir_practice.toString;

public class Animal {

    String name;
    String breed;
    int price;

    public Animal(String name, String breed, int price) {
        this.name = name;
        this.breed = breed;
        this.price = price;
    }

    public String toString() {
        return this.name + "  " + this.breed + "  " + this.price;
    }

    public static void main(String[] args) {
        Animal a = new Animal("Ola", "Huskey", 34500);
        System.out.println(a);
    }
}
