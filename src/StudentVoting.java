import java.util.Scanner;

public class StudentVoting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Please enter the ages of 10 students:");

        // Take user input for ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Check voting eligibility
        System.out.println("\n--- Voting Eligibility Results ---");
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age entered: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
    }
}