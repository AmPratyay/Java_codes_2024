package Java_patterns;

import java.util.Scanner;

public class SquarePattern {

    /*
        For the input 5 output of this program is :

                *  *  *  *  *
                *  *  *  *  *
                *  *  *  *  *
                *  *  *  *  *

    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int n = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
