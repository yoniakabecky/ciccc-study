package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // get name
        System.out.print("Hello. What is your name? >> ");
        String userName = scanner.next();

        // get age
        System.out.print("Hi, " + userName + "! How old are you? >> ");
        int userAge = scanner.nextInt();

        // get pay
        System.out.println("So you're " + userAge + ", eh? That's not old at all!");
        System.out.print("How much do you make, " + userName + "? >> ");
        double userMoney = scanner.nextDouble();

        System.out.println(+ userMoney + "! I hope that's per hour and not per year! LOL!");

    }
}
