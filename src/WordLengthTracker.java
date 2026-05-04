import java.util.Scanner;

public class WordLengthTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take user input using the Scanner nextLine() method
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // b. Split the text into words using custom method
        String[] words = splitWordsCustom(input);

        // d. Create 2D array of word and its length
        String[][] wordData = createWordLengthTable(words);

        // e. Display result in a tabular format
        System.out.println("-------------------------");
        System.out.printf("%-15s | %-10s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : wordData) {
            String word = row[0];
            // Convert length string back to int for display as requested
            int length = Integer.parseInt(row[1]);
            System.out.printf("%-15s | %-10d%n", word, length);
        }
        System.out.println("-------------------------");

        scanner.close();
    }

    /**
     * b. Splits text into words using charAt() without split()
     */
    public static String[] splitWordsCustom(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }

        // Count words first to initialize array size
        int wordCount = 0;
        boolean isWord = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && !isWord) {
                isWord = true;
                wordCount++;
            } else if (text.charAt(i) == ' ') {
                isWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord.toString();
                    currentWord.setLength(0);
                }
            }
        }
        // Add the last word
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord.toString();
        }

        return words;
    }

    /**
     * c. Finds string length without using length() method
     */
    public static int getCustomLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    /**
     * d. Creates 2D array of word and length, uses String.valueOf()
     */
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            // Get length using custom method
            int len = getCustomLength(words[i]);
            // Convert int to String using String.valueOf()
            table[i][1] = String.valueOf(len);
        }

        return table;
    }
}