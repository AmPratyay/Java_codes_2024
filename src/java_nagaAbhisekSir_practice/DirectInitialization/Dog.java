package java_nagaAbhisekSir_practice.DirectInitialization;

import java.util.Scanner;

public class Dog {

    public static int count;
    String breed;
    String color;
    int price;

    String type;

     static DogInputs dd;

    static Scanner sc = new Scanner(System.in);

    public static String position(String type, int count) {
        return type + " constructor call :  " + count;
    }

    public Dog() {
        count++;
        type = "Default";
        System.out.println(position(type, count));
    }

    public Dog(String breed, String color, int price) {
        count++;
        type = "parameterized";
        System.out.println(position(type, count));
        this.breed = breed;
        this.color = color;
        this.price = price;
    }

    private DogInputs inputs(){
        System.out.println("DOG BREED  : ");
        String a = sc.nextLine();
        System.out.println("DOG COLOR  : ");
        String b = sc.nextLine();
        System.out.println("DOG PRICE  : ");
        int c = sc.nextInt();
        dd = new DogInputs();
        dd.setBreed(a);
        dd.setColor(b);
        dd.setPrice(c);
        return dd;
    }

    private void printDog(String breed, String color, int price) {
        Dog d1 = new Dog(breed, color, price);
        System.out.println(d1.breed + " " + d1.price + " " + d1.color);
    }

    void firstCode(){
        Dog d = new Dog();
        dd = d.inputs();
        d.printDog(dd.getBreed(),dd.getColor(),dd.getPrice());
    }

    public static void main(String[] args) {
        Dog ddd = new Dog();
        ddd.firstCode();
        System.out.println("Press 1 for again or press any no to exit........");
        int repeatInput = sc.nextInt();
        if(repeatInput==1){
            ddd.firstCode();
        }else {
            System.out.println("Thankyou.....");
        }
    }

}
