package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        Random rd = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(rd.nextInt(100) + 1);
        }

        System.out.println("ArrayList: " + numbers);
    }
}
