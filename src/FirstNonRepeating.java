import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        // Step i: Create an array to store frequency of 256 ASCII characters
        int[] frequency = new int[256];

        // Step ii: Loop through the text to populate the frequency array
        for (int i = 0; i < text.length(); i++) {
            // Using charAt() as per instructions
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Step iii: Loop through the text again to find the first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // Return a null character indicator if no unique character exists
        return '\0';
    }

    public static void main(String[] args) {
        // Step c: Take user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the user-defined method
        char result = findFirstNonRepeating(input);

        // Display results
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}