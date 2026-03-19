public class findLargestAndSecondLargest {

    public static void findLargestAndSecondLargest(int[] digits, int size) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 25};

        findLargestAndSecondLargest(arr, arr.length);
    }
}