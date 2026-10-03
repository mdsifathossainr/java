import java.util.Scanner;

class Sort {

    // Selection Sort - Ascending Order
    static void ascendingSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Selection Sort - Descending Order
    static void descendingSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int maxIndex = i;

            // Find the largest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // Display array
    static void display(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

public class SelectionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ascending
        System.out.println("Ascending Sorted Array:");
        Sort.ascendingSort(arr);
        Sort.display(arr);

        // Descending
        System.out.println("Descending Sorted Array:");
        Sort.descendingSort(arr);
        Sort.display(arr);

        sc.close();
    }
}