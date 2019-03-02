package Week2.IfStatements;

import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        String gender = sc.next();
        System.out.print("First name: ");
        String firstName = sc.next();
        System.out.print("Last name: ");
        String lastName = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();

        String titles;

        if (age < 20) {
            titles = firstName;
        } else if (gender.equals("M")) {
            titles = "Mr.";
        } else {
            System.out.print("\nAre you married, " + firstName + " (y or n)? ");
            String isMarried = sc.next();
            if(isMarried.equals("y")) {
                titles = "Mrs.";
            } else {
                titles = "Ms.";
            }
        }

        System.out.printf("\nThen I shall call you %s %s.", titles, lastName);

    }
}
