import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FactorFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // a. Take the input for a number
        int number = scanner.nextInt();
        scanner.close();

        // b. Write a static Method to find the factors of the number and save them in an array and return the array.
        int[] factors = findFactors(number);

        System.out.println("\nFactors of " + number + ":");
        // Display the factors
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i < factors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // d. Write a method to find the sum of the factors using factors array
        long sum = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // e. Write a method to find the product of the factors using factors array
        long product = findProductOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // f. Write a method to find the sum of square of the factors using Math.pow() method.
        double sumOfSquares = findSumOfSquareOfFactors(factors);
        System.out.println("Sum of square of factors: " + sumOfSquares);
    }

    // b. Static method to find factors and return an array
    public static int[] findFactors(int n) {
        // c. To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count.
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
            }
        }

        // Convert ArrayList to array
        int[] factorsArray = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            factorsArray[i] = factorList.get(i);
        }
        return factorsArray;
    }

    public static long findSumOfFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double findSumOfSquareOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}