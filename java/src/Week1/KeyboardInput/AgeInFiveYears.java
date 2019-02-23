package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get name
        System.out.print("Hello. What is your name? ");
        String userName = scanner.next();

        // get age
        System.out.print("Hi, " + userName + "! How old are you? ");
        int userAge = scanner.nextInt();

        System.out.printf("Did you know that in five years you will be %d years old? \n", userAge + 5);
        System.out.printf("And five years ago you were %d! Imagine that!", userAge - 5);
    }
}
