package Week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you ready for a quiz? Yes->Y, No->N: ");
        String start = scanner.next();

        if (start.equals("Y")) {
            System.out.println("Okay, here it comes!");
            int correct = 0;
            playGame(correct);
            System.out.println("\nOverall, you got " + correct + " out of 3 correct.");
        }
        System.out.println("Thanks for playing!");
    }

    public static int playGame(int correct) {
        Scanner scanner = new Scanner(System.in);

        // Quiz 1
        System.out.println("Q1) What is the capital of Alaska?\n" +
                "1) Melbourne\n2) Anchorage\n3) Juneau");
        System.out.print("Your answer (1,2 or 3) >> ");
        int a1 = scanner.nextInt();

        if (a1 == 3) {
            System.out.println("\nThat's right!");
            correct += 1;
        } else if (a1 == 1) {
            System.out.println("\nSorry, \"Melbourne\" is not the capital of Alaska.");
        } else if (a1 == 2) {
            System.out.println("\nSorry, \"Anchorage\" is not the capital of Alaska.");
        } else {
            System.out.println("\nSorry, something went wrong....");
        }
        System.out.println("\n");

        // Quiz 2
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" +
                "1) yes\n2) no\n");
        System.out.print("Your answer (1 or 2) >> ");
        int a2 = scanner.nextInt();

        if (a2 == 2) {
            System.out.println("\nThat's right!");
            correct += 1;
        } else if (a2 == 1) {
            System.out.println("\nSorry, \"cat\" is a string. ints can only store numbers.");
        } else {
            System.out.println("\nSorry, something went wrong....");
        }
        System.out.println("\n");

        // Quiz 3
        System.out.println("Q3) What is the result of 9+6/3?\n" +
                "1) 5\n2) 11\n3) 15/3");
        System.out.print("Your answer (1,2 or 3) >> ");
        int a3 = scanner.nextInt();

        if (a3 == 2) {
            System.out.println("\nThat's correct!");
            correct += 1;
        } else if (a3 == 1) {
            System.out.println("\nSorry, \"5\" is wrong. You need calculate 6/3 first.");
        } else if (a3 == 3) {
            System.out.println("\nSorry, \"15/3\" is wrong. You need calculate 6/3 first.");
        } else {
            System.out.println("\nSorry, something went wrong....");
        }

        return correct;
    }

}
