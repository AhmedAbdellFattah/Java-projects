package qone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Qone {
    public static void main(String[] args) {
        // Step 1: Prompt the user to enter the file path
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            // Step 2: Open the specified file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Step 3-9: Read each line, process each character, and write to the new file
            String line; //To store each line
            StringBuilder processedText = new StringBuilder();

            while ((line = reader.readLine()) != null)//This line starts a loop to read each line from the file until there are no more lines.
            {
                for (int i = 0; i < line.length(); i++)//To iterate through each character in the current line
                {
                    char currentChar = line.charAt(i); //retrieve every charachter, charAt(): to access every charachter in a string.

                    // Step 5: If the character is a (consonant), display it as-is
                    if (Character.isLetter(currentChar) && !"AEIOUaeiou".contains(String.valueOf(currentChar))) {
                        processedText.append(currentChar);
                    }
                    // Step 6: If the character is a lowercase vowel, display it as a capital letter
                    else if (Character.isLowerCase(currentChar) && "aeiou".contains(String.valueOf(currentChar))) {
                        processedText.append(Character.toUpperCase(currentChar));
                    } else {
                        processedText.append(currentChar);
                    }
                }

                // Append a newline character after processing each line
                processedText.append("\n");
            }

            // Step 9: Close the file
            reader.close();

            // Step 10: Make a new file called "processed_file.txt" and write the processed text
            String processedFilePath = "processed_file.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(processedFilePath));
            writer.write(processedText.toString());
            writer.close();

            // Step 11: Print the new file
            System.out.println("Processed file content:");
            System.out.println(processedText.toString());

            System.out.println("File processed successfully!");

        } catch (IOException e) {
            // Step 12: Handle exceptions related to file IO
            System.err.println("An error occurred while processing the file: " + e.getMessage());
            e.printStackTrace(); //method that belongs to the Throwable class, which is the superclass of all exceptions and errors in Java. This method is commonly used to print the stack trace of an exception to the standard error stream (usually the console)
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
}