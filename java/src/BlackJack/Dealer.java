package BlackJack;

class Dealer extends Person{

    Dealer(DeckOfCards allCards, Card myCard) {
        super(allCards, myCard);
    }


    void drawMoreCards() {
        while (getValueOfAHand() < 17) {
            drawACard();
        }
        System.out.println("Dealer\n" + getTheDrawnCard() + " : " + getValueOfAHand() + "\n");
        if (getValueOfAHand() > 21) {
            setBust();
        }
    }
}
