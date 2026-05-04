import java.util.Scanner;

public class UniqueCharactersFinder {

    // a. Method to find the length of the text without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates we reached the end of the string
        }
        return count;
    }

    // b. Method to find unique characters in a string
    public static char[] getUniqueCharacters(String text) {
        int n = getLength(text);
        char[] tempArray = new char[n];
        int uniqueCount = 0;

        // Nested Loop to compare characters
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                // If same characters exist at different positions, it's not unique
                if (i != j && text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            // If the character is unique, store it in the temp array
            if (isUnique) {
                tempArray[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }

        // iii. Create a new array to store only the actual unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = tempArray[i];
        }
        return result;
    }

    // c. Main function to take input and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Input String: " + input);
        System.out.println("String Length: " + getLength(input));

        char[] uniqueChars = getUniqueCharacters(input);

        System.out.print("Unique Characters: ");
        if (uniqueChars.length == 0) {
            System.out.println("None");
        } else {
            for (char c : uniqueChars) {
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }
}