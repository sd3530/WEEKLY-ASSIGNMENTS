import java.util.Arrays;

public class NumberChecker {

    // a. Method to find the count of digits in a number
    public static int getDigitCount(int number) {
        if (number == 0) return 1;
        return (int) Math.log10(Math.abs(number)) + 1;
    }

    // b. Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = getDigitCount(number);
        int[] digits = new int[count];
        int temp = Math.abs(number);

        // Fill array from right to left
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // c. Method to check if a number is a duck number using the digits array
    // Definition: A number with at least one non-zero digit (and historically a zero)
    public static boolean isDuckNumber(int[] digits) {
        // According to the prompt: a duck number has a non-zero digit present in it.
        for (int digit : digits) {
            if (digit != 0) return true;
        }
        return false;
    }

    // d. Method to check if the number is an Armstrong number using the digits array
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // e. Method to find the largest and second largest elements
    public static void printLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest: " + (largest == Integer.MIN_VALUE ? "N/A" : largest));
        System.out.println("Second Largest: " + (secondLargest == Integer.MIN_VALUE ? "N/A" : secondLargest));
    }

    // f. Method to find the smallest and second smallest elements
    public static void printSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest: " + (smallest == Integer.MAX_VALUE ? "N/A" : smallest));
        System.out.println("Second Smallest: " + (secondSmallest == Integer.MAX_VALUE ? "N/A" : secondSmallest));
    }

    public static void main(String[] args) {
        int testNumber = 153;
        System.out.println("Processing Number: " + testNumber);

        // Call different methods
        int count = getDigitCount(testNumber);
        int[] digits = getDigitsArray(testNumber);

        System.out.println("a. Digit Count: " + count);
        System.out.println("b. Digits Array: " + Arrays.toString(digits));
        System.out.println("c. Is Duck Number: " + isDuckNumber(digits));
        System.out.println("d. Is Armstrong Number: " + isArmstrongNumber(testNumber, digits));

        System.out.println("e. Finding Max values:");
        printLargestAndSecondLargest(digits);

        System.out.println("f. Finding Min values:");
        printSmallestAndSecondSmallest(digits);
    }
}