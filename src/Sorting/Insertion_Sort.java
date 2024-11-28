import java.util.Scanner;
public class Insertion_Sort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create array and take inputs
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        // Start the timer
        long startTime = System.currentTimeMillis();

        // Perform insertion sort
        insertionSort(arr);

        // End the timer
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted array:");
        printArray(arr);

        // Calculate and print the runtime
        long duration = endTime - startTime;
        System.out.println("Sorting completed in: " + duration + " milliseconds");

        scanner.close();
    }
}
