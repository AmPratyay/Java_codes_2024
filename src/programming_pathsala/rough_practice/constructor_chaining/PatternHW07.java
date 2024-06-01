package programming_pathsala.rough_practice.constructor_chaining;

import java.util.Scanner;

public class PatternHW07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i % 2 + " ");
            }
            System.out.println();
        }
    }
}
