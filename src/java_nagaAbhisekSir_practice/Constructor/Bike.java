package java_nagaAbhisekSir_practice.Constructor;

public class Bike {
    String name;
    String color;
    int price;
    int tax;

    public Bike(String name,String color,int price,int tax){
        this.name= name;
        this.color = color;
        this.price = price;
        this.tax= tax;
    }
    void details(){
        System.out.println(this.name+"  "+this.color+"  "+(+this.price+this.tax));
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Honda ","Black",200000,3000);
        b1.details();
        b1 = new Bike("Duke","Orange",300000,9800);
        b1.details();
        b1=new Bike("Continental","chrome",340000,10400);
        b1.details();
    }
}
