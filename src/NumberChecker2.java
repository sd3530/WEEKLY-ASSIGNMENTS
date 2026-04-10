import java.util.Scanner;

public class NumberChecker2 {

    // a. Method to find the count of digits
    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        return String.valueOf(Math.abs(number)).length();
    }

    // a. Method to Store the digits in an array
    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];
        number = Math.abs(number);
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // b. Method to find the sum of digits using the array
    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // c. Method to find the sum of squares of digits using Math.pow()
    public static int getSumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += (int) Math.pow(d, 2);
        }
        return sum;
    }

    // d. Method to check if Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = getSumOfDigits(digits);
        return (sum != 0 && number % sum == 0);
    }

    // e. Method to find frequency of each digit (2D array: [digit][frequency])
    public static int[][] getDigitFrequency(int[] digits) {
        int[] counts = new int[10];
        int uniqueCount = 0;

        for (int d : digits) {
            if (counts[d] == 0) uniqueCount++;
            counts[d]++;
        }

        int[][] freqTable = new int[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] > 0) {
                freqTable[index][0] = i;
                freqTable[index][1] = counts[i];
                index++;
            }
        }
        return freqTable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digitsArr = getDigitsArray(num);
        int sum = getSumOfDigits(digitsArr);

        System.out.println("Digit Count: " + getDigitCount(num));
        System.out.print("Digits Array: ");
        for(int d : digitsArr) System.out.print(d + " ");

        System.out.println("\nSum of Digits: " + sum);
        System.out.println("Sum of Squares of Digits: " + getSumOfSquares(digitsArr));
        System.out.println("Is Harshad Number: " + isHarshadNumber(num, digitsArr));

        System.out.println("Digit Frequencies (Digit | Frequency):");
        int[][] freq = getDigitFrequency(digitsArr);
        for (int[] row : freq) {
            System.out.println(row[0] + " | " + row[1]);
        }
        sc.close();
    }
}