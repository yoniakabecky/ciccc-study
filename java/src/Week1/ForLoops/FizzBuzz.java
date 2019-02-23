package Week1.ForLoops;

import java.util.Random;

public class FizzBuzz {
    public static void main(String[] args) {
        Random random = new Random();

        int myCard1 = random.nextInt(10) + 1;
        int myCard2 = random.nextInt(10) + 1;
        int dCard1 = random.nextInt(10) + 1;
        int dCard2 = random.nextInt(10) + 1;
        int myTotal = myCard1 + myCard2;
        int dTotal = dCard1 + dCard2;

        System.out.println("Baby Blackjack!");

        System.out.printf("\nYou drew %d and %d.\n", myCard1, myCard2);
        System.out.printf("Your total is %d.\n", myTotal);

        System.out.printf("\nThe dealer has %d and %d.\n", dCard1, dCard2);
        System.out.printf("Dealer's total is %d.\n", dTotal);

        if (myTotal > dTotal) {
            System.out.println("\nYOU WIN!");
        } else if (myTotal < dTotal) {
            System.out.println("\nYOU LOSE!");
        } else {
            System.out.println("\nDRAW!");
        }
    }
}
