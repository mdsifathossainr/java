import java.util.Scanner;

class Sort {

    // Bubble Sort in Ascending Order
    static void ascendingSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) { // Time Complexity: O(n²)

            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swap if the current element is greater
                // than the next element
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort in Descending Order
    static void descendingSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swap if the current element is smaller
                // than the next element
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Display the array
    static void display(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

public class BubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size from keyboard
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements from keyboard
        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort and display in Ascending Order
        System.out.println("Ascending Sorted Array:");
        Sort.ascendingSort(arr);
        Sort.display(arr);

        // Sort and display in Descending Order
        System.out.println("Descending Sorted Array:");
        Sort.descendingSort(arr);
        Sort.display(arr);

        sc.close();
    }
}