package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    DeckOfCards dCards;
    Cards aCard;

    private List dealer = new ArrayList();
    private int dealerSum;
    private boolean bust = false;

    public Dealer(DeckOfCards allCards, Cards myCard) {
        this.dCards = allCards;
        this.aCard = myCard;
    }

    public List getDealer() {
        return dealer;
    }

    public void setDealer() {
        dCards.setaCard();
        aCard.setMarks(dCards.getaCard());
        aCard.setNumber(dCards.getaCard());
        this.dealer.add(aCard.getMarks() + aCard.getNumbers());
        setDealerSum();
        dCards.removeACard();
    }

    public int getDealerSum() {
        return dealerSum;
    }

    public void setDealerSum() {
        aCard.setPoints(dCards.getaCard());
        this.dealerSum += aCard.getPoints();
    }

    public boolean isBust() {
        return bust;
    }

    public void setBust() {
        this.bust = true;
    }

    public void moreCards() {
        while (getDealerSum() < 17) {
            setDealer();
        }
        System.out.println("Dealer\n" + getDealer() + " : " + getDealerSum() + "\n");
        if (getDealerSum() > 21) {
            setBust();
        }
    }

}
