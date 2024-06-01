package programming_pathsala.rough_practice;

public class PatternPrac2 {

    public static void main(String[] args) {

        for (int k = 3; k > 0; k--) {
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i <= 2; i++) {
                if (i > 0) {
                    for (int j = 2; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
