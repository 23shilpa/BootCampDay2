import java.util.Scanner;

public class ReverseStringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Generate the reversed string
        String reversedString = reverseString(inputString);

        // Set the limit on the number of attempts
        int maxAttempts = 3;
        int attempts = 0;

        // Play the game
        while (attempts < maxAttempts) {
            // Ask the user to guess the reversed string
            System.out.print("Guess the reverse of the string: ");
            String userGuess = scanner.nextLine();

            // Check if the guess is correct
            if (userGuess.equals(reversedString)) {
                System.out.println("Congratulations! You guessed it correctly. You win!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect guess. Attempts left: " + (maxAttempts - attempts));
            }
        }

        // Check if the user used all attempts without guessing correctly
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you used all your attempts. Computer wins!");
        }

        scanner.close();
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(charArray);
    }
}
