package collections_DurgaSir;

public class Bike {

    String name;
    int price;

    public Bike(String n, int p) {
        this.name = n;
        this.price = p;
    }

    public String toString() {
        return "Bike Name" + name + " Price : " + price;
    }
}
