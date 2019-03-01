package Week2.Arrays;

import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] numbers = new int[10];
        int maxNum = 0;
        int indexOfMaxNum = 0;

        System.out.print("Array:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100) + 1;
            System.out.print(" " + numbers[i]);
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
                indexOfMaxNum = i;
            }
        }
        System.out.println("\nThe largest valuse is " + maxNum);
        System.out.println("It is in slot " + indexOfMaxNum);
    }
}
