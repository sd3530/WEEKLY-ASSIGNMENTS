import java.util.Scanner;
import java.util.Arrays;

public class WordSplitter {

    public static void main(String[] args) {
        // a. Take user input using Scanner nextLine()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = sc.nextLine();

        // e. Call user-defined method and built-in split()
        String[] customWords = customSplit(input);

        // Handling built-in split (regex "\\s+" handles multiple spaces)
        String[] builtInWords = input.trim().isEmpty() ? new String[0] : input.trim().split("\\s+");

        // Display results
        System.out.println("\nUser-Defined Result: " + Arrays.toString(customWords));
        System.out.println("Built-in split() Result: " + Arrays.toString(builtInWords));

        // Call comparison method
        boolean match = compareArrays(customWords, builtInWords);
        System.out.println("\nDo the arrays match? " + match);

        sc.close();
    }

    // b. Method to find length without using built-in length()
    public static int getCustomLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    // c. Method to split text into words using charAt()
    public static String[] customSplit(String text) {
        int len = getCustomLength(text);
        if (len == 0) return new String[0];

        // i. Count words to determine array size
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        // ii. Use logic to extract words
        String[] words = new String[wordCount];
        int wordIdx = 0;
        String currentWord = "";

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord += c;
            } else if (!currentWord.equals("")) {
                words[wordIdx++] = currentWord;
                currentWord = "";
            }
        }
        // Capture last word if exists
        if (!currentWord.equals("")) {
            words[wordIdx] = currentWord;
        }

        return words;
    }

    // d. Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}