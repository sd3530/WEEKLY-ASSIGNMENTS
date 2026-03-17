import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // a. Take user input for a number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // b. Find the count of digits in the number.
        String numString = String.valueOf(number);
        int digitCount = numString.length();

        // c. Find the digits in the number and save them in an array
        int[] originalDigits = new int[digitCount];
        int temp = number;
        for (int i = digitCount - 1; i >= 0; i--) {
            originalDigits[i] = temp % 10;
            temp /= 10;
        }

        // d. Create an array to store the elements of the digits array in reverse order
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = originalDigits[digitCount - 1 - i];
        }

        // e. Finally, display the elements of the array in reverse order.
        System.out.print("Original digits array: [");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(originalDigits[i] + (i == digitCount - 1 ? "" : ", "));
        }
        System.out.println("]");

        System.out.print("Reversed digits array: [");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i] + (i == digitCount - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}