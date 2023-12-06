import java.util.Scanner;

public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number for which the table is to be generated
        System.out.print("Enter a number: ");
        int baseNumber = scanner.nextInt();

        // Input the range for the table
        System.out.print("Enter the range (e.g., up to 10): ");
        int range = scanner.nextInt();

        // Generate and print the table
        System.out.println("Multiplication Table for " + baseNumber + ":");
        for (int i = 1; i <= range; i++) {
            int result = baseNumber * i;
            System.out.println(baseNumber + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
