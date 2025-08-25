//Alexis Mitchell
// August 24, 2025
// This program stimulates playing "Rock-Paper-Scissors" against the computer


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Generate computer's choice (1 = Rock, 2 = Paper, 3 = Scissors)
        int computerChoice = rand.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
        int userChoice = scanner.nextInt();

        // Display choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine result
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    // Helper method to convert numbers to choices
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}

