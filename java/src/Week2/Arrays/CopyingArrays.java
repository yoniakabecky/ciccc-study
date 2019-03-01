package Week2.Arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random rd = new Random();

        //Create an array of ten integers
        int[] arr1 = new int[10];

        // Fill the array with ten random numbers (1-100)
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rd.nextInt(100) + 1;
        }

        // Copy the array into another array of the same capacity
        int[] arr2 = new int[arr1.length];
        arr2 = Arrays.copyOf(arr1, arr1.length);

        // Change the last value in the first array to a -7
        arr1[arr1.length - 1] = -7;

        // Display the contents of both arrays
        System.out.print("Array 1: ");
        for(int i: arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Array 2: ");
        for(int i: arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
