/**
 * The SearchTimeComparison class compares the performance of linear and binary searches
 * for finding the minimum and maximum values in a randomly generated array of integers.
 */
package searchtimecomparison;

import java.util.Arrays;

public class SearchTimeComparison {

    /**
     * The main method is the entry point of the program.
     * It generates an array of random integers, performs linear searches for minimum and maximum,
     * and binary searches for minimum and maximum. It then displays the results and running times.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Generate an array of random integers
        int[] array = generateArray(1000);

        // Linear search
        long linearStartTime = System.nanoTime();
        int linearMin = findMinLinear(array);
        int linearMax = findMaxLinear(array);
        long linearEndTime = System.nanoTime();
        long linearRunningTime = linearEndTime - linearStartTime;

        // Binary search
        Arrays.sort(array); // Binary search requires a sorted array
        long binaryStartTime = System.nanoTime();
        int binaryMin = findMinBinary(array);
        int binaryMax = findMaxBinary(array);
        long binaryEndTime = System.nanoTime();
        long binaryRunningTime = binaryEndTime - binaryStartTime;

        // Display results
        System.out.println("Linear Search Results:");
        System.out.println("Min: " + linearMin);
        System.out.println("Max: " + linearMax);
        System.out.println("Running Time: " + linearRunningTime + " nanoseconds\n");

        System.out.println("Binary Search Results:");
        System.out.println("Min: " + binaryMin);
        System.out.println("Max: " + binaryMax);
        System.out.println("Running Time: " + binaryRunningTime + " nanoseconds");
    }

    /**
     * Linear search for minimum value in an array.
     *
     * @param array The array to search.
     * @return The minimum value in the array.
     */
    private static int findMinLinear(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Linear search for maximum value in an array.
     *
     * @param array The array to search.
     * @return The maximum value in the array.
     */
    private static int findMaxLinear(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    /**
     * Binary search for minimum value in a sorted array.
     *
     * @param array The sorted array to search.
     * @return The minimum value in the array.
     */
    private static int findMinBinary(int[] array) {
        return array[0]; // Since the array is sorted, the minimum is the first element
    }

    /**
     * Binary search for maximum value in a sorted array.
     *
     * @param array The sorted array to search.
     * @return The maximum value in the array.
     */
    private static int findMaxBinary(int[] array) {
        return array[array.length - 1]; // Since the array is sorted, the maximum is the last element
    }

    /**
     * Generate an array of random integers.
     *
     * @param size The size of the array.
     * @return An array of random integers.
     */
    private static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000); // Generating random integers between 0 and 999
        }
        return array;
    }
}