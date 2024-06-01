package programming_pathsala.rough_practice.constructor_chaining;

import java.util.Scanner;

public class PatternHW09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(k % 2 + " ");
                k++;
            }
            System.out.println();
        }
    }

}
