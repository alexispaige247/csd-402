//Alexis Mitchell
// August 31, 2025
// This program displays the average value of a four types of array.

import java.util.Arrays;

public class AverageArray {

    //Calculate average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    //Calculate average of int array
    public static int average(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (int) (sum / array.length);
    }
    
    //Calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // arrays of different sizes
        short[] shortArray = {5, 10, 15, 20, 25};
        int[] intArray = {3, 6, 9, 12};
        long[] longArray = {2, 4, 6, 8, 10, 12};
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display original arrays and their averages
        System.out.println("Short array: " + Arrays.toString(shortArray) + " | Average: " + average(shortArray));
        System.out.println("Int array: " + Arrays.toString(intArray) + " | Average: " + average(intArray));
        System.out.println("Long array: " + Arrays.toString(longArray) + " | Average: " + average(longArray));
        System.out.println("Double array: " + Arrays.toString(doubleArray) + " | Average: " + average(doubleArray));
    }
}
