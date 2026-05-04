import java.util.Scanner;
import java.util.Arrays;

public class StringCharacterConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input using the Scanner next() method
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // b. Call user-defined method to return characters
        char[] customArray = getCharsCustom(input);

        // Call String built-in toCharArray() method
        char[] builtInArray = input.toCharArray();

        // Display the results
        System.out.println("Original String: " + input);
        System.out.println("Custom Method Output: " + Arrays.toString(customArray));
        System.out.println("Built-in Method Output: " + Arrays.toString(builtInArray));

        // c. & d. Compare the 2 arrays and display result
        boolean areEqual = compareCharArrays(customArray, builtInArray);
        System.out.println("Are both arrays equal? " + areEqual);

        scanner.close();
    }

    /**
     * b. Method to return the characters in a string without using toCharArray()
     */
    public static char[] getCharsCustom(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i); // Using charAt() to get character at index
        }
        return chars;
    }

    /**
     * c. Method to compare two char arrays and return a boolean result
     */
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        // Arrays.equals checks for length and then element-by-element equality
        return Arrays.equals(arr1, arr2);
    }
}