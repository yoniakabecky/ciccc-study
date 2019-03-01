package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(rd.nextInt(50) + 1);
        }
        System.out.println("ArrayList: " + numbers);

        System.out.print("Value to find: ");
        int findNum = sc.nextInt();

        System.out.println();
        for (int i: numbers) {
            if (i == findNum) {
                System.out.println(findNum + " is in the ArrayList.");
            }
        }
    }
}
