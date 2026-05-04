public class NullPointerDemo {

    // a. Method to generate the Exception
    public static void generateNullPointer() {
        System.out.println("--- Inside generateNullPointer ---");
        String text = null; // Variable initialized to null

        // Calling a String method (length()) on a null reference
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // b. Method to demonstrate/handle NullPointerException
    public static void handleNullPointer() {
        System.out.println("\n--- Inside handleNullPointer ---");
        String text = null; // Variable initialized to null

        try {
            // Attempting to use a String method
            System.out.println(text.toLowerCase());
        } catch (NullPointerException e) {
            // Catching and handling the Exception
            System.out.println("Caught Expected Exception: " + e);
            System.out.println("Message: Cannot perform operations on a null object.");
        }
    }

    public static void main(String[] args) {
        // Step 1: Call method to generate the Exception
        // Note: This will terminate the program if not caught higher up.
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Main caught: " + e);
        }

        // Step 2: Call the method that handles the Exception
        handleNullPointer();

        System.out.println("\nProgram finished successfully.");
    }
}