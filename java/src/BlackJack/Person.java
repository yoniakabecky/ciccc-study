package BlackJack;

import java.util.ArrayList;
import java.util.List;

class Person {

    private DeckOfCards dCards;
    private Card aCard;

    private List person = new ArrayList();
    private int valueOfAHand;
    private boolean isBust = false;
    private boolean isBJ = false;
    private boolean ace = false;
    private boolean faceCard = false;
    private int countAces = 0;


    Person(DeckOfCards allCards, Card myCard) {
        this.dCards = allCards;
        this.aCard = myCard;
    }


    List getTheDrawnCard() {
        return person;
    }

    void drawACard() {
        dCards.setACard();
        aCard.setSuits(dCards.getACard());
        aCard.setRanks(dCards.getACard());
        this.person.add(aCard.getSuits() + aCard.getRanks());
        setValueOfAHand();
        setBJ();
    }

    int getValueOfAHand() {
        return valueOfAHand;
    }

    private void setValueOfAHand() {
        aCard.setPoints(dCards.getACard());
        if (aCard.getPoints() == 10) {
            this.faceCard = true;
        }
        if (aCard.getPoints() == 11) {
            this.ace = true;
            this.countAces++;
        }
        this.valueOfAHand += aCard.getPoints();

        if (this.ace && this.valueOfAHand > 21) {
            if (this.countAces != 0) {
                this.valueOfAHand -= 10;
                countAces--;
            }
        }
    }

    boolean isBust() {
        return isBust;
    }

    void setBust() {
        isBust = true;
    }

    boolean isBJ() {
        return isBJ;
    }

    private void setBJ() {
        if (this.ace && this.faceCard) {
            isBJ = true;
        }
    }
}
