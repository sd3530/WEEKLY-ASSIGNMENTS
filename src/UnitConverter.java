/**
 * UnitConverter Utility Class
 * Provides static methods for distance conversions.
 */
public class UnitConverter {

    // Conversion constants as specified
    private static final double KM2MILES = 0.621371;
    private static final double MILES2KM = 1.60934;
    private static final double METERS2FEET = 3.28884;
    private static final double FEET2METERS = 0.3048;

    // a. Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM2MILES;
    }

    // b. Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES2KM;
    }

    // c. Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS2FEET;
    }

    // d. Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET2METERS;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        double kilometers = 10.0;
        double miles = 5.0;
        double meters = 100.0;
        double feet = 300.0;

        System.out.println(kilometers + " km = " + UnitConverter.convertKmToMiles(kilometers) + " miles");
        System.out.println(miles + " miles = " + UnitConverter.convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + UnitConverter.convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + UnitConverter.convertFeetToMeters(feet) + " meters");
    }
}