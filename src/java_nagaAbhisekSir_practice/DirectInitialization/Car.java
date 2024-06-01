package java_nagaAbhisekSir_practice.DirectInitialization;

public class Car {

    String brand = "Honda", color = "Red";
    int price = 1600000;

   /* public String toString(){
        return this.brand+"\n"+this.color+"\n"+this.price;
    }*/

    public static void main (String[] args){
        Car c1 = new Car();
        System.out.println(c1.brand+" "+c1.color+" "+c1.price);
        Car c2 = new Car();
        System.out.println(c2.brand+" "+ c2.color+" "+ c2.price);

    }

}
