import java.util.Scanner;

public class NumberChecker {

    public static int checkNumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        int result = checkNumber(inputNumber);
        String sign;

        if (result == -1) {
            sign = "negative";
        } else if (result == 1) {
            sign = "positive";
        } else {
            sign = "zero";
        }

        System.out.println("The number is " + sign + ".");
    }
}