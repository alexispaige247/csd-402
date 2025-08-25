// Alexis Mitchell
// August 24, 2025
// This program uses nested for loops to create a pyramid pattern

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 7;
        int numWidth = 2; // width of each number + space

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = rows; s > i; s--) {
                for (int k = 0; k < numWidth; k++) {
                    System.out.print(" ");
                }
            }

            // Print left side (increasing powers of 2)
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }

            // Print right side (decreasing powers of 2)
            num /= 2;
            for (int j = 1; j < i; j++) {
                num /= 2;
                System.out.print(num + " ");
            }

            // Print trailing spaces to align @
            int totalNumbers = i * 2 - 1;
            int maxNumbers = rows * 2 - 1;
            int spacesAfter = (maxNumbers - totalNumbers) * numWidth;
            for (int k = 0; k < spacesAfter; k++) {
                System.out.print(" ");
            }

            // Print @
            System.out.println("@");
        }
    }
}

