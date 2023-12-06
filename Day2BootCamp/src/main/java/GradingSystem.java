import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the numerical score
        System.out.print("Enter the student's numerical score: ");
        int score = scanner.nextInt();

        // Check and output the corresponding letter grade
        String letterGrade = getLetterGrade(score);
        System.out.println("The corresponding letter grade is: " + letterGrade);

        scanner.close();
    }

    // Function to get the letter grade based on the numerical score
    public static String getLetterGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else if (score >= 0 && score <= 59) {
            return "F";
        } else {
            return "Invalid score. Please enter a numerical score between 0 and 100.";
        }
    }
}
