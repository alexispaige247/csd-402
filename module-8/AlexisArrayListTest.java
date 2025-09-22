// Alexis Mitchell
// September 21, 2025
// This program prompts the user to enter integers into an ArrayList,
// then finds and displays the maximum value using the max method.

import java.util.ArrayList;
import java.util.Scanner;

public class AlexisArrayListTest {

    // Method to find the maximum value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0; 
        }

        Integer maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop):");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int value = scanner.nextInt();
                numbers.add(value);  
                if (value == 0) {
                    break;
                }
            }
        }

        // Call the max method
        Integer largest = max(numbers);

        // Display the result
        System.out.println("The largest value in the list is: " + largest);
    }
}