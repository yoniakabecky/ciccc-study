package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String yourName = scanner.next();

        System.out.print("Ok, " + yourName + ", how old are you? ");
        int yourAge = scanner.nextInt();

        while (yourAge <= 0) {
            System.out.print("You are not born yet? How old are you? ");
            yourAge = scanner.nextInt();
        }

        if (yourAge < 16) {
            System.out.print("You can't drive, " + yourName + ".");
        } else if (yourAge >= 16 && yourAge <= 17) {
            System.out.print("You can drive but you can't vote, " + yourName + ".");
        } else if (yourAge >= 18 && yourAge <= 24) {
            System.out.print("You can vote but you can't rent a car, " + yourName + ".");
        } else{
            System.out.print("You can do pretty much anything, " + yourName + ".");
        }
    }
}
