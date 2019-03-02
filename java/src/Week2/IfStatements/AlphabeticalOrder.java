package Week2.IfStatements;

import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your last name? ");
        String lastName = sc.next();

        if (lastName.compareTo("Carswell") <= 0) {
            System.out.println("you don't have to wait long");
        } else if (lastName.compareTo("Jones") <= 0) {
            System.out.println("that's not bad");
        } else if (lastName.compareTo("Smith") <= 0) {
            System.out.println("looks like a bit of a wait");
        } else if (lastName.compareTo("Young") <= 0) {
            System.out.println("it's gonna be a while");
        } else {
            System.out.println("not going anywhere for a while?");
        }

    }
}
