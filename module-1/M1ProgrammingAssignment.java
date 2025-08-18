// Alexis Mitchell
// Module 1 Programming Assignment
// August 17, 2025
// This program calculates the energy needed to heat water from an initial temperature
// to a final temperature.

import java.util.Scanner;

public class M1ProgrammingAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for water mass
        System.out.print("Enter water mass in kilograms: ");
        double waterMass = input.nextDouble();

        // Prompt user for initial temperature
        System.out.print("Enter the initial temperature of the water in Celsius: ");
        double initialTemp = input.nextDouble();

        // Prompt user for final temperature
        System.out.print("Enter the final temperature of the water in Celsius: ");
        double finalTemp = input.nextDouble();

        // Calculate energy
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("The energy needed to heat the water is " + Q + " Joules.");

        input.close();
    }
}
