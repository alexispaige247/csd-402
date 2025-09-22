// Alexis Mitchell
// September 21, 2025
// This program creates/opens a file, writes/appends 10 random integers,
// then reads and prints the file contents.

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            // Create file if it doesn’t exist
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            }

            // Write or append 10 random integers
            FileWriter writer = new FileWriter(file, true); // true = append mode
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // random numbers 0–99
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("10 random numbers written/appended to file.");

            // Reopen and read file contents
            Scanner fileReader = new Scanner(file);
            System.out.println("\nContents of data.file:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}