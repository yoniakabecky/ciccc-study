package BlackJack;

import java.util.Scanner;

class Player extends Person{

    Scanner scanner = new Scanner(System.in);

    private boolean hitOrStand = true;


    Player(DeckOfCards allCards, Card myCard) {
        super(allCards, myCard);
    }


    private boolean isHitOrStand() {
        return hitOrStand;
    }

    void hitOrStand() {
        while (!isBust() && isHitOrStand()) {
            System.out.print("Hit(h) or Stand(s): ");
            String userInput = scanner.next();
            System.out.println();
            if (userInput.equals("h")) {
                drawMoreCards();
            } else if (userInput.equals("s")) {
                this.hitOrStand = false;
            } else {
                System.out.println("Please enter \"h\" or \"s\".");
                hitOrStand();
            }

        }
    }

    private void drawMoreCards() {
        if (isHitOrStand()) {
            drawACard();
            System.out.println("Player\n" + getTheDrawnCard() + " : " + getValueOfAHand() + "\n");
        }
        if (getValueOfAHand() > 21) {
            setBust();
        }
    }

}
