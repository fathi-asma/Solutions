import java.util.Scanner;

public class checkPrimeOrNot_part2 {
    public static void main(String args[]) {

        // Create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Line space for correct formatting
        System.out.println();

        // Check if the number is negative
        if (number < 0) {
            System.out.print("Enter a non-negative number");
        } else {
            int factorCount = 0; // Counting factors
            int[] factors = new int[number]; // Array to store factors
            int index = 0; // Index for the factors array

            // Loop for counting the number of factors
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    factors[index] = j; // Store the factor in the array
                    index++;
                    factorCount++;
                }
            }

            // Display the number and its factors
            System.out.println("Number: " + number);
            System.out.println("Factor count: " + factorCount);

            // Determine if the entered number is primary or not
            if (number == 0 || number == 1) {
                System.out.println("Status: not a primary number");
            } else if (factorCount == 2) {
                System.out.println("Status: primary number");
            } else {
                System.out.println("Status: not a primary number");
            }

            // Print the factors
            System.out.print("Factors: ");
            for (int i = 0; i < factorCount; i++) {
                if (i != 0) {
                    System.out.print(", "); // Print a comma between factors
                }
                System.out.print(factors[i]); // Print each factor
            }
            System.out.println(); // Move to a new line after printing all factors
        }

        input.close();
    }
}
