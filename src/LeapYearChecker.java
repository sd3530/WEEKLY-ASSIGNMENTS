import java.util.Scanner;

public class LeapYearChecker {

    // Method to check for Leap Year using conditions a and b
    public static boolean checkLeapYear(int year) {
        // Condition a: Works for year >= 1582 (Gregorian calendar)
        if (year < 1582) {
            return false;
        }

        // Condition b: Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Use the Scanner class for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");

        int year = sc.nextInt();

        // Check conditions and output result
        if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582.");
        } else if (checkLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}