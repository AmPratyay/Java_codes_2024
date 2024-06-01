package java_nagaAbhisekSir_practice.this_keyword;

public class Laptop {
    String brand;
    String name;
    String processor ;
    int price;
    Laptop(String brand,String name,String processor ,int price){
        this.brand=brand;
        this.name=name;
        this.processor=processor;
        this.price=price;
    }

    public String toString(){
        return this.brand+"     "+this.name+"   "+this.processor+"  "+this.price;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell","Latitude 3460","Intel i7",45000);
        Laptop l2 = new Laptop("Lenovo","Thin pad","Intel i5",39000);
        Laptop l3 = new Laptop("HP","Pavalion","RYZEN 4",52000);
        Laptop l4 = new Laptop("MSI","Modern 14","RYZEN 5",48500);

        System.out.println(l1+"\n"+l2+"\n"+l3+"\n"+l4);
    }
}
