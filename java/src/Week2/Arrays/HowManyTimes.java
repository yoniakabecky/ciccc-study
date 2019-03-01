package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        System.out.print("Array:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(50) + 1;
            System.out.print(" " + numbers[i]);
        }

        System.out.print("\nValue to find: ");
        int findNum = sc.nextInt();

        System.out.println();
        for (int i: numbers) {
            if (i == findNum) {
                count++;
            }
        }
        System.out.println(findNum + " was found "+ count + " times.");
    }
}
