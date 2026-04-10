import java.util.Random;

public class FootBallHeights {
    public static void main(String[] args) {
        // Create an int array named heights of size 11
        int[] heights = new int[11];
        Random random = new Random();

        // Get 3 digits random height in cms for each player (150 to 250)
        System.out.print("Player Heights (cms): ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Range: 150 to 250
            System.out.print(heights[i] + " ");
        }

        // Display results
        System.out.println("\n\n--- Statistics ---");
        System.out.println("Shortest Height: " + findShortest(heights) + " cms");
        System.out.println("Tallest Height: " + findTallest(heights) + " cms");
        System.out.println("Mean Height: " + findMean(heights) + " cms");
    }

    // Method to Find the sum of all elements
    public static int findSum(int[] array) {
        int sum = 0;
        for (int h : array) {
            sum += h;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] array) {
        return (double) findSum(array) / array.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] array) {
        int min = array[0];
        for (int h : array) {
            if (h < min) min = h;
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] array) {
        int max = array[0];
        for (int h : array) {
            if (h > max) max = h;
        }
        return max;
    }
}