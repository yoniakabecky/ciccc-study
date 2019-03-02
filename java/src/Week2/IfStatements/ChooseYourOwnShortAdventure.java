package Week2.IfStatements;

import java.util.Scanner;

public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DESTINATION PLANNER");

        place1(sc);

        System.out.println("Have a good holidays!!");

    }

    private static void place1(Scanner sc){
        System.out.print("\nWhere would you like to go next holidays?\n" +
                    "Do you prefer \"cold weather\" or \"hot weather\"?\n" +
                    "Enter the number: Cold(1) or Hot(0) >> ");
        int choice = sc.nextInt();

        if (choice == 1) {
            place2(sc);
        } else if (choice == 0) {
            place3(sc);
        } else {
            System.out.println("Please try again.");
            place1(sc);
        }
    }

    private static void place2(Scanner sc) {
        // Cold: Canada
        System.out.print("\nOkay, you prefer Cold weather.\n" +
                    "Do you like to visit \"Big Cities\" or \"Nature spot\"?\n" +
                    "Enter the number: City(1) or Nature(0) >> ");
        int choice = sc.nextInt();

        if (choice == 1) {
            place4(sc);
        } else if (choice == 0) {
            place5(sc);
        } else {
            System.out.println("Please try again.");
            place2(sc);
        }
    }

    private static void place3(Scanner sc) {
        // Hot: Australia
        System.out.print("\nOkay, you prefer Hot weather.\n" +
                "Which is sound nice to you? \"2 seasons\" or \"4 seasons\"\n" +
                "Enter the number: 2 or 4 >> ");
        int choice = sc.nextInt();

        if (choice == 2) {
            place6(sc);
        } else if (choice == 4) {
            place7(sc);
        } else {
            System.out.println("Please try again.");
            place3(sc);
        }
    }

    private static void place4(Scanner sc) {
        // Canadian cities
        System.out.print(
                "\nDo you prefer a mild climate?\n" +
                "\"YES(y)\" or \"NO(n)\" >> ");
        String choice = sc.next();

        if (choice.equals("y") || choice.equals("n")) {
            lastChoice1(choice);
        } else {
            System.out.println("Please try again.");
            place4(sc);
        }
    }

    private static void place5(Scanner sc) {
        // Canadian natures
        System.out.print(
                "\nWould you like to do a lot of activities?\n" +
                "\"YES(y)\" or \"NO(n)\" >> ");
        String choice = sc.next();

        if (choice.equals("y") || choice.equals("n")) {
            lastChoice2(choice);
        } else {
            System.out.println("Please try again.");
            place5(sc);
        }
    }

    private static void place6(Scanner sc) {
        // 2 seasons
        System.out.print(
                "\nWould you like to have an outback experience?\n" +
                "\"YES(y)\" or \"NO(n)\" >> ");
        String choice = sc.next();

        if (choice.equals("y") || choice.equals("n")) {
            lastChoice3(choice);
        } else {
            System.out.println("Please try again.");
            place6(sc);
        }
    }

    private static void place7(Scanner sc) {
        // 4 seasons
        System.out.print(
                "\nDo you prefer a big city than a small city?\n" +
                "\"YES(y)\" or \"NO(n)\" >> ");
        String choice = sc.next();

        if (choice.equals("y") || choice.equals("n")) {
            lastChoice4(choice);
        } else {
            System.out.println("Please try again.");
            place7(sc);
        }
    }

    private static void lastChoice1(String choice) {
        if (choice.equals("n")) {
            // Toronto
            System.out.println("\nHow about Toronto, Canada");
        } else {
            // Vancouver
            System.out.println("\nHow about Vancouver, Canada");
        }
    }

    private static void lastChoice2(String choice) {
        if (choice.equals("n")) {
            // Niagara falls
            System.out.println("\nHow about Niagara falls, Canada");
        } else {
            // Rockey Mountains
            System.out.println("\nHow about Rockey Mountains, Canada");
        }
    }

    private static void lastChoice3(String choice) {
        if (choice.equals("y")) {
            // Darwin
            System.out.println("\nHow about Darwin, Australia");
        } else {
            // Cairns
            System.out.println("\nHow about Cairns, Australia");
        }

    }

    private static void lastChoice4(String choice) {
        if (choice.equals("y")) {
            // Sydney
            System.out.println("\nHow about Sydney, Australia");
        } else {
            // Perth
            System.out.println("\nHow about Perth, Australia");
        }
    }

}
