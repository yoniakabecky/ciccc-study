package Week1.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(10) + 1;
        System.out.println(number);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

        while (true) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("That's right! You're a good guesser.");
                break;
            } else {
                System.out.println("That is incorrect. Guess again.");
            }
        }

    }
}
