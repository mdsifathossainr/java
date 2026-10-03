
import java.util.Scanner;

class Sort {

    // Insertion Sort - Ascending Order
    static void ascendingSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int cur = arr[i];
            int pre = i - 1;

            while (pre >= 0 && arr[pre] > cur) {
                arr[pre + 1] = arr[pre];
                pre--;
            }

            arr[pre + 1] = cur;
        }
    }

    // Insertion Sort - Descending Order
    static void descendingSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int cur = arr[i];
            int pre = i - 1;

            while (pre >= 0 && arr[pre] < cur) {
                arr[pre + 1] = arr[pre];
                pre--;
            }

            arr[pre + 1] = cur;
        }
    }

    // Display Array
    static void display(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();
    }
}

public class InsertionSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Ascending Sorted Array:");
        Sort.ascendingSort(arr);
        Sort.display(arr);

        System.out.println("Descending Sorted Array:");
        Sort.descendingSort(arr);
        Sort.display(arr);

        sc.close();
    }
}