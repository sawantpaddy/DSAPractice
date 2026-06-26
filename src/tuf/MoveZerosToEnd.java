package tuf;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        System.out.println("Before: " + Arrays.toString(arr));

        moveZerosToEnd(arr);

        System.out.println("After : " + Arrays.toString(arr));
    }
}