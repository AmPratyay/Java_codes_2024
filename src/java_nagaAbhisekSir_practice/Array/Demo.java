package java_nagaAbhisekSir_practice.Array;

public class Demo {

    public static void main(String[] args) {
        String str[] = {"Thor", "Spider-Man", "Iron-Man", "Hulk", "Captain america"};

        System.out.println("Accessing java_nagaAbhisekSir_practice.Array in Forward direction....");
        for (int i = 0; i <= str.length - 1; i++) {
            System.out.println(str[i]);
        }

        System.out.println("Accessing java_nagaAbhisekSir_practice.Array in Backward direction....");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
