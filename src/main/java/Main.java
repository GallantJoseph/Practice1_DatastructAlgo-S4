import java.util.Scanner;

/**
 * Description: Practice 1 - Datastructures & Algorithms
 * Author: Joseph Gallant
 * Date: September 9, 2025
 */

public class Main {
    public static void main(String[] args) {
//        Calculate the average temperature, and give how many days are above the average temperature
//
//        1. Take an input from the user (eg. 5)
//        2. Prompt the user to enter all the 5 numbers (temperature values)
//        3. Calculate the average temperature
//        4. Given the average temperature, how many of the numbers in the line 2 are above the average temperature?

        final int NUMBER_OF_TEMPERATURES = 5;

        Scanner scanner = new Scanner(System.in);

        int[] tempArr = new int[NUMBER_OF_TEMPERATURES];
        double tempSum = 0d;

        // Input each temperature and calculate the sum
        for (int i = 0; i < NUMBER_OF_TEMPERATURES; i++) {
            System.out.println("\nEnter temperature " + (i + 1) + ":");
            tempArr[i] = scanner.nextInt();

            tempSum += tempArr[i];
        }

        double tempAverage;
        tempAverage = tempSum / NUMBER_OF_TEMPERATURES;

        // Count how many temperatures are above average
        int countAboveAverage = 0;

        for (int i = 0; i < NUMBER_OF_TEMPERATURES; i++) {
            if (tempArr[i] > tempAverage) {
                countAboveAverage++;
            }
        }

        System.out.println("\nThe average temperature is: " + tempAverage);
        System.out.println("The number of temperatures above average is: " + countAboveAverage);
        scanner.close();
    }
}
