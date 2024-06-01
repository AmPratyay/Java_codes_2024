package java_nagaAbhisekSir_practice.this_keyword;

public class Bike {

    String name;
    int price;

    // current calling object reference using this keyword
    Bike(){
        System.out.println(this);
    }

    // Direct Initializing states using constructor
    Bike(int i){
        System.out.println(this.name="Yamaha");
        System.out.println(this.price=100000);
        System.out.println(this.price=i);
    }

    // Initializing states using constructor
    Bike(String name, int price){
        this.name=name;
        this.price=price;
        System.out.println(this.name+"\n"+this.price);
    }

    public static void main(String[] args) {
        // current calling object reference using this keyword
        Bike b1 = new Bike();
        Bike b2 = new Bike();

        // Direct Initializing states using constructor
        Bike b3 = new Bike(10);
        System.out.println(b3.price);
        Bike b4 = new Bike(100);
        System.out.println(b4.price);


        // Initializing states using constructor
        Bike b5 = new Bike("Honda",1000000);
        Bike b6 = new Bike("TATA",1600000);
        Bike b7 = new Bike("Mahindra",1300000);

        System.out.println(
                b1.name+"   "+b1.price+"\n"+
                b2.name+"   "+b2.price+"\n"+
                b3.name+"   "+b3.price+"\n"+
                b4.name+"   "+b4.price+"\n"+
                b5.name+"   "+b5.price+"\n"+
                b6.name+"   "+b6.price+"\n"+
                b7.name+"   "+b7.price+"\n");

    }
}
