package printhellomultipletimes;

/**
 * The Main class demonstrates a simple Java program that prints a specified word
 * multiple times using a for loop.
 */
public class PrintHelloMultipleTimes {
/**
     * The main method is the entry point of the program.
     * It initializes a String variable "word" with the value "Hello"
     * and then prints the word along with the iteration count in a loop.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String args[]) {
        // Declare and initialize variables
        int num;
        String word = "Hello";

        // Loop to print the word along with iteration count
        for (num = 1; num <= 10; num++) {
            System.out.println("word " + word + " is printed: " + num + " times.");
        }
    }
}
