package java_nagaAbhisekSir_practice.Array;

public class Test {

    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] = 100;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 40;
        System.out.println(arr.length);
        System.out.println(arr[1]);

        int a[] = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Accessing java_nagaAbhisekSir_practice.Array in Forward direction....");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Accessing java_nagaAbhisekSir_practice.Array in Backward direction....");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
