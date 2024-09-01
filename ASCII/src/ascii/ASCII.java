/**
 * The ASCII class demonstrates how to convert a character to its corresponding ASCII value in Java.
 */
package ascii;

public class ASCII {

    /**
     * The main method is the entry point of the program.
     * It initializes a character 'A', converts it to its ASCII value, and prints the result.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String args[]) {
        // Represents the character 'A'
        char ch = 'A';

        // Converts the character to its ASCII value (65 in this case)
        int asciiValue = (int) ch;

        // Prints the result
        System.out.println("ASCII value of 'A': " + asciiValue);
    }
}
