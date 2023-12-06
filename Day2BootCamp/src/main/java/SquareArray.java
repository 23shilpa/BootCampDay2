public class SquareArray {
    public static void main(String[] args) {
        // Generate an array of squares
        int[] squareArray = generateSquareArray();

        // Print the array
        System.out.println("Array of Squares from 1 to 10:");
        for (int i = 0; i < squareArray.length; i++) {
            System.out.println("Square of " + (i + 1) + ": " + squareArray[i]);
        }
    }

    // Function to generate an array of squares from 1 to 10
    public static int[] generateSquareArray() {
        int[] squares = new int[10];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = (i + 1) * (i + 1);
        }
        return squares;
    }
}
