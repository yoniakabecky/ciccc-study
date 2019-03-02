package Week2.IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your current earth weight(lbs): ");
        int currentWeight = sc.nextInt();

        System.out.println("\n" +
                "I have information for the following planets:\n" +
                "1. Venus   2. Mars    3. Jupiter\n" +
                "4. Saturn  5. Uranus  6. Neptune\n" +
                "\n");

        System.out.print("Which planet are you visiting? ");
        int visitingPlanet = sc.nextInt();
        while (visitingPlanet >= 1 && visitingPlanet >= 6) {
            System.out.print("Please enter the number 1 - 6 :");
            visitingPlanet = sc.nextInt();
        }

        double weightWouldBe = 0;
        String planetYoureGoing = "";

        switch (visitingPlanet) {
            case 1:
                planetYoureGoing = "Venus";
                weightWouldBe = currentWeight * 0.78;
                break;
            case 2:
                planetYoureGoing = "Mars";
                weightWouldBe = currentWeight * 0.39;
                break;
            case 3:
                planetYoureGoing = "Jupiter";
                weightWouldBe = currentWeight * 2.65;
                break;
            case 4:
                planetYoureGoing = "Saturn";
                weightWouldBe = currentWeight * 1.17;
                break;
            case 5:
                planetYoureGoing = "Uranus";
                weightWouldBe = currentWeight * 1.05;
                break;
            case 6:
                planetYoureGoing = "Neptune";
                weightWouldBe = currentWeight * 1.23;
                break;

        }

        System.out.printf("\nYour weight would be %.2f pounds on the %s", weightWouldBe, planetYoureGoing);

    }



}



