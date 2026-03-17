import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step a: Get integer input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an integer array to store results
        int[] table = new int[10];

        // Step b: Run a loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Step c: Display the results
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        scanner.close();
    }
}