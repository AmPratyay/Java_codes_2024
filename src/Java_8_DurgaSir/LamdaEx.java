package Java_8_DurgaSir;

public class LamdaEx {

    // Normal method


    // Convert it into Lamda expression -> No name , No return type  , No Modifiers
    // Lamda conversion
    // () -> { System.out.println("Hello"); }


    public static void main(String[] args) {
        Interf i = () -> System.out.println("Hello");
        i.m1();

        Interef2 i2 = (a,b) -> System.out.println("Sum is : "+(a+b));
        i2.add(10,20);
    }
}
