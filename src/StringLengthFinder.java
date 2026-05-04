import java.util.Scanner;

public class StringLengthFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        // a. Take user input using the Scanner next() method
        String input = scanner.next();

        // c. Main function calls both methods and displays results
        int customLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        scanner.close();
    }

    /**
     * b. Method to find string length using an infinite loop and
     * exception handling instead of the built-in length() method.
     */
    public static int findLength(String str) {
        int count = 0;
        try {
            // Infinite loop to count each character
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Handles the exception when index exceeds string bounds
            return count;
        }
    }
}