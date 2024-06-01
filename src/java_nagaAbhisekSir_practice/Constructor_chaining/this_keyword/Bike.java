package java_nagaAbhisekSir_practice.Constructor_chaining.this_keyword;


public class Bike extends Son {

    Bike(){
        super();
        System.out.println("Bike 1");
    }

    Bike(int x){
        this();
        System.out.println("Bike 2");
    }

    Bike(int x,int y){
        this(11);
        System.out.println("Bike 3");
    }

    public static void main(String[] args) {
        new Bike(11,12);
    }
}
