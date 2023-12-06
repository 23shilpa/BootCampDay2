import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the day number
        System.out.print("Enter a number from 1 to 7: ");
        int dayNumber = scanner.nextInt();

        // Check and output the corresponding day of the week
        String dayOfWeek = getDayOfWeek(dayNumber);
        System.out.println("The corresponding day of the week is: " + dayOfWeek);

        scanner.close();
    }

    // Function to get the day of the week based on the day number
    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid day number. Please enter a number from 1 to 7.";
        }
    }
}
