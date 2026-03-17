import java.util.Scanner;

public class FriendFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        System.out.println("Enter ages and heights for Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }
        scanner.close();

        int minAge = ages[0];
        String youngestFriend = names[0];
        double maxHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestFriend = names[i];
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        System.out.println("\nResults:");
        System.out.println("Youngest friend: " + youngestFriend + " (Age: " + minAge + ")");
        System.out.println("Tallest friend: " + tallestFriend + " (Height: " + maxHeight + " cm)");
    }
}