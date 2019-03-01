package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] tenIntegers = new int[10];

        for (int i = 0; i < tenIntegers.length; i++) {
            tenIntegers[i] = rd.nextInt(100) + 1;
            System.out.printf("Slot %d contains a %d\n", i, tenIntegers[i]);
        }
    }

}
