package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        boolean isThere = false;

        System.out.print("Array:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(50) + 1;
            System.out.print(" " + numbers[i]);
        }

        System.out.print("\nValue to find: ");
        int findNum = sc.nextInt();

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == findNum) {
                System.out.println(findNum + " is in slot " + i + ".");
                isThere = true;
            }
        }
        if (!isThere) {
            System.out.println(findNum + " is not in the array.");
        }
    }
}
