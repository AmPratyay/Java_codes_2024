package java_nagaAbhisekSir_practice.Method;

public class Bike {
    String brand;
    String color;
    int price;
    int roadTax;

    public void details(String brand,String color,int price,int roadTax){
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.roadTax=roadTax;
        System.out.println(this);
    }

    public String toString(){
        return this.brand+" "+this.color+"  "+this.price+this.roadTax;

    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.details("Yamaha R15","Orange",180000,32000);
        b1.details("TVS 160 $V","Black",180000,32000);
        b1.details("Bajaj platina","Red",180000,32000);
        b1.details("Hero Sp 125","Green",180000,32000);
    }
}
