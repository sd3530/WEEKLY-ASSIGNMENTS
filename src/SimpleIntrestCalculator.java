import java.util.Scanner;

public class SimpleIntrestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate od Intrest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time period (in years): ");
        double time = sc.nextDouble();

        sc.close();
    }
}