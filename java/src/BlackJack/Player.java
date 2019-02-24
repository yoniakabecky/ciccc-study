package BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    DeckOfCards dCards;
    Cards aCard;
    Scanner scanner = new Scanner(System.in);

    private List player = new ArrayList();
    private int playerSum;
    private boolean hitOrStand = true;
    private boolean bust = false;
    private boolean ace = false;
    private boolean faceCard = false;
    private boolean bj = false;

    public Player(DeckOfCards allCards, Cards myCard) {
        this.dCards = allCards;
        this.aCard = myCard;
    }

    public List getPlayer() {
        return player;
    }

    public void setPlayer() {
        dCards.setaCard();
        aCard.setMarks(dCards.getaCard());
        aCard.setNumber(dCards.getaCard());
        this.player.add(aCard.getMarks() + aCard.getNumbers());
        setPlayerSum();
        setBj();
        dCards.removeACard();
    }

    public int getPlayerSum() {
        return playerSum;
    }

    public void setPlayerSum() {
        aCard.setPoints(dCards.getaCard());
        if (this.ace && aCard.getPoints() == 11) {
            this.playerSum += 1;
        } else {
            if (aCard.getPoints() == 1 || aCard.getPoints() == 11) {
                this.ace = true;
            }
            if (aCard.getPoints() == 10) {
                this.faceCard = true;
            }
            this.playerSum += aCard.getPoints();
        }
    }

    public boolean isHitOrStand() {
        return hitOrStand;
    }

    public boolean isBust() {
        return bust;
    }

    public void setBust() {
        this.bust = true;
    }

    public void setBj() {
        if (this.ace && this.faceCard) {
            this.bj = true;
        }
    }

    public boolean isBj() {
        return bj;
    }

    public void hitOrStand() {
        while (!isBust() && isHitOrStand()) {
            System.out.print("Hit(h) or Stand(s): ");
            String userInput = scanner.next();
            System.out.println();
            if (userInput.equals("h")) {
                moreCards();
            } else if (userInput.equals("s")) {
                this.hitOrStand = false;
            } else {
                System.out.println("Please enter \"h\" or \"s\".");
                hitOrStand();
            }

        }
    }

    public void moreCards() {
        if (isHitOrStand()) {
            setPlayer();
            System.out.println("Player\n" + getPlayer() + " : " + getPlayerSum() + "\n");
        }
        if (getPlayerSum() > 21) {
            setBust();
        }
    }

}
