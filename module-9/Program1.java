// Alexis Mitchell
// September 21, 2025
// This program uses an ArrayList to store Strings, prints them, and 
// allows user to select one by index.

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        // Create an ArrayList with at least 10 Strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Cantaloupe");
        words.add("Banana");
        words.add("Cherry");
        words.add("Strawberry");
        words.add("Blueberry");
        words.add("Orange");
        words.add("Watermelon");
        words.add("Honeydew");
        words.add("Kiwi");
        words.add("Lemon");

        // Use a for-each loop to print the ArrayList
        System.out.println("ArrayList Elements:");
        for (String word : words) {
            System.out.println(word);
        }

        // Ask user which element they would like to see again
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter the index number of the element you want to see again (1-10): ");
            
            // Autoboxing: Scanner gives us a String, convert it to Integer
            String userInput = scanner.nextLine();
            Integer index = Integer.parseInt(userInput); // Autoboxing String → Integer

            try {
                // Auto-unboxing when accessing element by index
                String chosenWord = words.get(index);
                System.out.println("Element at index " + index + ": " + chosenWord);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Out of Bounds");
            }
        }
    }
}
