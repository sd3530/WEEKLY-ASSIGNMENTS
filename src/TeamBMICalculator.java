import java.util.Scanner;

public class TeamBMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numMembers = 10;
        // a. 2D array: 10 rows (members), 2 columns (0: weight, 1: height)
        double[][] memberData = new double[numMembers][2];

        System.out.println("--- Enter Height (cm) and Weight (kg) for " + numMembers + " Members ---");

        for (int i = 0; i < numMembers; i++) {
            System.out.println("Member " + (i + 1) + ":");
            System.out.print("Enter Weight (kg): ");
            memberData[i][0] = sc.nextDouble(); // Store weight
            System.out.print("Enter Height (cm): ");
            memberData[i][1] = sc.nextDouble(); // Store height
        }

        // c. Call method to process and compute BMI and Status
        String[][] results = calculateAndClassify(memberData);

        // d. Display the result
        displayResults(results);

        sc.close();
    }

    // b. Method to find BMI and Status (returns 2D String Array)
    public static String[][] calculateAndClassify(double[][] data) {
        String[][] results = new String[data.length][4]; // Weight, Height, BMI, Status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // Convert cm to m

            // BMI = weight / (height * height)
            double bmi = weight / (heightM * heightM);
            String status = "";

            // Determine Status
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store in 2D String array (Formatted)
            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", heightCm);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }

    // d. Method to display 2D string array in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-10s | %-10s | %-10s\n", "Member", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d | %-12s | %-10s | %-10s | %-10s\n",
                    (i + 1), results[i][0], results[i][1], results[i][2], results[i][3]);
        }
        System.out.println("---------------------------------------------------------");
    }
}