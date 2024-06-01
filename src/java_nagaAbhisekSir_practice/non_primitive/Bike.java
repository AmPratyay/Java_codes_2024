package java_nagaAbhisekSir_practice.non_primitive;

public class Bike {

    String name;
    String color;
    int price;

    public Bike(String n, String c, int p) {
        this.name = n;
        this.color = c;
        this.price = p;
    }

    public String toString() {
        return this.name + "      " + this.color + "       " + this.price;
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Honda", "Orange", 230000);
        Bike b2 = new Bike("Yamaha", "Red", 430000);
        Bike b3 = new Bike("Bajaj", "Blue", 130000);
        Bike b4 = new Bike("KTM_Duke", "Chrome", 530000);

        Bike b[] = {b1, b2, b3, b4};

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
