public class DivisibleByThreeArray {
    public static void main(String[] args) {
        // Find numbers between 1 to 30 that are divisible by 3
        int[] divisibleByThreeArray = findDivisibleByThreeNumbers();

        // Print the array
        System.out.println("Numbers between 1 to 30 that are divisible by 3:");
        for (int i = 0; i < divisibleByThreeArray.length; i++) {
            System.out.print(divisibleByThreeArray[i] + " ");
        }
    }

    // Function to find numbers between 1 to 30 that are divisible by 3
    public static int[] findDivisibleByThreeNumbers() {
        int count = 0;
        // Count the number of elements to determine the size of the array
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                count++;
            }
        }

        // Create an array of numbers divisible by 3
        int[] divisibleByThreeArray = new int[count];
        int index = 0;
        // Populate the array with numbers divisible by 3
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                divisibleByThreeArray[index++] = i;
            }
        }

        return divisibleByThreeArray;
    }
}
