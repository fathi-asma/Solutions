import java.util.ArrayList;
import java.util.Scanner;

public class checkPrimeOrNotpart3 {
    public static void main(String[] args) {
        // Create a scanner object to get user inputs
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a range
        System.out.print("Enter the Range: ");
        int startRange = input.nextInt();
        int endRange = input.nextInt();

        // Lists to store prime and non-prime numbers
        ArrayList<Integer> primaryNumbers = new ArrayList<>();
        ArrayList<Integer> nonPrimaryNumbers = new ArrayList<>();

        // Check each number in the range
        for (int i = startRange; i <= endRange; i++) {
            if (i > 1 && isPrime(i)) {
                primaryNumbers.add(i);
            } else if (i > 1) {
                nonPrimaryNumbers.add(i);
            }
        }

        // Display the results
        System.out.println("Primary Numbers: " + formatList(primaryNumbers));
        System.out.println("Non-Primary Numbers: " + formatList(nonPrimaryNumbers));

        input.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to format the list as a comma-separated string
    static String formatList(ArrayList<Integer> list) {
        return list.isEmpty() ? "Not Found!" : list.toString().replaceAll("[\\[\\]]", "");
    }
}
