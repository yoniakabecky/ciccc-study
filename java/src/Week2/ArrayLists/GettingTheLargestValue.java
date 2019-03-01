package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        Random rd = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        int maxNum = 0;

        for (int i = 0; i < 10; i++) {
            numbers.add(rd.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + numbers);

        System.out.println();
        for (int i: numbers) {
            if (i > maxNum) {
                maxNum = i;
            }
        }

        System.out.println("The largest value is " + maxNum);
    }
}
