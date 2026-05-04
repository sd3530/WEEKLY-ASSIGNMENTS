import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // a. Take user input using the Scanner next() method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // b. Use the custom method to compare using charAt()
        boolean customResult = compareUsingCharAt(str1, str2);

        // c. Use the built-in equals() method to verify results
        boolean builtInResult = str1.equals(str2);

        // Display the comparison and verification
        System.out.println("\n--- Results ---");
        System.out.println("Custom charAt() comparison: " + customResult);
        System.out.println("Built-in equals() comparison: " + builtInResult);

        if (customResult == builtInResult) {
            System.out.println("Verification successful: Both results match.");
        } else {
            System.out.println("Verification failed: Results do not match.");
        }

        scanner.close();
    }

    /**
     * b. Compares two strings using the charAt() method.
     * Returns true if all characters at each index are identical.
     */
    public static boolean compareUsingCharAt(String s1, String s2) {
        // First check: if lengths are different, strings cannot be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Second check: iterate through each index and compare characters
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}