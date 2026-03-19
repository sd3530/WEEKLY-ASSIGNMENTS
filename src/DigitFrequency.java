import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        // Array to store the frequency of digits 0-9
        int[] frequency = new int[10];

        // Handle the case where the input number is 0
        if (number == 0) {
            frequency[0]++;
        } else {
            long temp = number;
            while (temp != 0) {
                int digit = (int) (temp % 10);
                frequency[digit]++;
                temp /= 10;
            }
        }

        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}