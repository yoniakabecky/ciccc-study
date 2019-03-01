package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        boolean isThere = false;

        for (int i = 0; i < 10; i++) {
            numbers.add(rd.nextInt(50) + 1);
        }
        System.out.println("ArrayList: " + numbers);

        System.out.print("Value to find: ");
        int findNum = sc.nextInt();

        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == findNum) {
                System.out.println(findNum + " is in slot " + i + ".");
                isThere = true;
            }
        }
        if (!isThere) {
            System.out.println(findNum + " is not in the ArrayList. ");
        }
    }
}
