package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Dealer {

    DeckOfCards dCards;
    Cards aCard;

    private List dealer = new ArrayList();
    private int dealerSum;
    private boolean blast = false;

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

    public boolean isBlast() {
        return blast;
    }

    public void setBlast() {
        this.blast = true;
    }

    public void moreCards() {
        while (getDealerSum() < 17) {
            setDealer();
            setDealerSum();
        }
        System.out.println("Dealer\n" + getDealer() + " : " + getDealerSum() + "\n");
        if (getDealerSum() > 21) {
            setBlast();
        }
    }

}
