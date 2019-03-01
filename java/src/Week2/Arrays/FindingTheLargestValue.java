package Week2.Arrays;

import java.util.Random;


public class FindingTheLargestValue {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] numbers = new int[10];
        int maxNum = 0;

        System.out.print("Array:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100) + 1;
            System.out.print(" " + numbers[i]);
        }

        System.out.println();
        for (int i: numbers) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.println("\nThe largest valuse is " + maxNum);
    }
}
