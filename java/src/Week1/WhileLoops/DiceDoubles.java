package Week1.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class DiceDoubles {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("HERE COMES THE DICE!\n");

        while (true) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.printf("The total is %d!\n\n", dice1 + dice2);

            if (dice1 == dice2) {
                break;
            }
        }
    }
}
