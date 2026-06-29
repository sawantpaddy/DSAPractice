package tuf;

public class SelectionSort {

	public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6, 8, 5};

        // Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
