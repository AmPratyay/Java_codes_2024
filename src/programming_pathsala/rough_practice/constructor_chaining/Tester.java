package programming_pathsala.rough_practice.constructor_chaining;

public class Tester {

    public static void main(String[] args) {
        // Define the size of the pattern
        int size = 3;

        // Loop for each row of the pattern
        for (int row = 1; row <= size * 2 - 1; row++) {
            // Calculate the number of spaces and stars for each row
            int spaces = Math.abs(size - row);
            int stars = size - spaces;

            // Print spaces
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            // Print stars
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
