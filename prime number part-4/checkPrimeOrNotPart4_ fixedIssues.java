import java.util.Scanner;

public class checkPrimeOrNotPart4_ fixedIssues{

    // Method to count number of factors
    public static int getFactorCount(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int factorCount) {
        if (factorCount == 2) {
            return true; // Return true for prime
        } else {
            return false; // Return false for non-prime
        }
    }

    // Method to retrieve all factors of a number
    public static int[] getFactors(int number, int factorCount) {
        int[] factors = new int[factorCount];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.println();

        // Get factor count
        int factorCount = getFactorCount(number);
        System.out.println("Factor count: " + factorCount);

        // Check if number is prime
        boolean isPrimeNumber = isPrime(factorCount);
        System.out.println("Status: " + (isPrimeNumber ? "Primary Number" : "Non-Primary Number"));

        // Retrieve and display all factors
        int[] factors = getFactors(number, factorCount);
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i < factors.length - 1) { // Add a comma if not the last factor
                System.out.print(", ");
            }
        }

        input.close();
    }
}
