package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Person {
    DeckOfCards dCards;
    Card aCard;

    private List person = new ArrayList();
    private int valueOfAHand;
    private boolean isBust;
    private boolean isBJ;

    public Person(DeckOfCards allCards, Card myCard) {
        this.dCards = allCards;
        this.aCard = myCard;
    }

    public List getPerson() {
        return person;
    }

    public void setPerson() {
        dCards.setaCard();
        aCard.setMarks(dCards.getaCard());
        aCard.setNumber(dCards.getaCard());
        this.person.add(aCard.getMarks() + aCard.getNumbers());
        setValueOfAHand();
        dCards.removeACard();
    }

    public int getValueOfAHand() {
        return valueOfAHand;
    }

    public void setValueOfAHand() {
        aCard.setPoints(dCards.getaCard());
        this.valueOfAHand += aCard.getPoints();
    }

    public boolean isBust() {
        return isBust;
    }

    public void setIsBust() {
        this.isBust = true;
    }


}
