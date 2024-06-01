package java_nagaAbhisekSir_practice.Inheritance;

public class Apple extends Moblie {

    public static void main(String[] args) {
        Apple a = new Apple();
        a.name = "IPHONE-15 pro max";
        a.color = "White";
        a.price = 130000;
        System.out.println(a.name + "  " + a.color + "  " + a.price);
        a.noti("APPLE_IPHONE 15 pro max");
    }
}
