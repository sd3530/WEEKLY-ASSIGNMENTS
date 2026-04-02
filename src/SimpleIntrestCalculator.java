import java.util.Scanner;

public class SimpleIntrestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        double SimpleIntrest = (principal * rate * time) / 100;
        System.out.println("SimplaIntrest: "+ simpleIntrest);
        sc.close();
    }
}