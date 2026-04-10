import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the length of the first side (in meters):");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of the second side (in meters):");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of the third side (in meters):");
        double side3 = scanner.nextDouble();


        int rounds = computeRounds(side1, side2, side3);

        System.out.println("The athlete must complete approximately " + rounds + " rounds.");

        scanner.close();
    }


    public static int computeRounds(double s1, double s2, double s3) {

        double perimeter = s1 + s2 + s3; // in meters
        double totalDistance = 5000; // 5 km in meters

        // We use Math.ceil to ensure the athlete completes at least 5km
        double exactRounds = totalDistance / perimeter;
        return (int) Math.ceil(exactRounds);
    }
}