import java.util.Scanner;

public class checkPrimeOrNotPart4 {

    // Method to count factors and collect them in an array
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int[] factors) {
        return factors.length == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the Number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            // Get factors
            int[] factors = getFactors(number);

            // Print factor count
            System.out.println("\nFactor Count: " + factors.length);

            // Print prime status
            System.out.println("Status: " + (isPrime(factors) ? "Primary Number" : "Non-Primary Number"));

            // Print all factors
            System.out.print("Factors: ");
            for (int i = 0; i < factors.length; i++) {
                System.out.print(factors[i]);
                if (i < factors.length - 1) {
                    System.out.print(", ");
                }
            }
        } catch (Exception inputError) {
            System.out.println("Error: Invalid input. Please enter a valid positive integer.");
        } 
            scanner.close();
        
    }
}

	




