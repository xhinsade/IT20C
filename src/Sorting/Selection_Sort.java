import java.util.Scanner;

public class Selection_Sort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        // Perform selection sort
        selectionSort(arr);

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
