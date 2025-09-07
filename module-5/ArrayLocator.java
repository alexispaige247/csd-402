// Alexis Mitchell
// September 7, 2025
// This program locates the largest and smallest elements in the arrays of both integers and doubles

public class ArrayLocator {

    // Locate largest 
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Test function
    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 9},
            {1, -4, 7},
            {6, 2, 8}
        };

        double[][] doubleArray = {
            {2.5, 4.1, 9.9},
            {7.3, 0.2, -1.5},
            {6.6, 3.3, 8.8}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int at: [" + largestInt[0] + "][" + largestInt[1] + "]");
        System.out.println("Smallest int at: [" + smallestInt[0] + "][" + smallestInt[1] + "]");

        System.out.println("Largest double at: [" + largestDouble[0] + "][" + largestDouble[1] + "]");
        System.out.println("Smallest double at: [" + smallestDouble[0] + "][" + smallestDouble[1] + "]");
    }
}