import java.util.Scanner;
import java.util.Random;

public class RandomArrayGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Number of attempts allowed for input validation
        int maxAttempts = 3;

        // Get the size of the array from the user
        int arraySize = 0;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter the size of the array (between 1 and 10): ");
            arraySize = scanner.nextInt();

            if (arraySize >= 1 && arraySize <= 10) {
                break;
            } else {
                attempts++;
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        }

        // Check if the correct input was entered in three attempts
        if (attempts == maxAttempts && (arraySize < 1 || arraySize > 10)) {
            System.out.println("Array Size entered is not correct. Exiting the program.");
            System.exit(0);
        }

        // Generate and print the array of random numbers
        double[] randomArray = generateRandomArray(arraySize, random);

        System.out.println("Array of random numbers between 100.0 to 500.0:");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.println(randomArray[i]);
        }

        scanner.close();
    }

    // Function to generate an array of random numbers
    public static double[] generateRandomArray(int size, Random random) {
        double[] randomArray = new double[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = 100.0 + (random.nextDouble() * 400.0);
        }
        return randomArray;
    }
}
