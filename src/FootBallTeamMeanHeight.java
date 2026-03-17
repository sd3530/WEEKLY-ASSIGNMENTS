import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;

        System.out.println("Enter the heights of 11 players:");

        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height (in cm): ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        scanner.close();
        // Proceed to calculate the mean in the next step
    }
}