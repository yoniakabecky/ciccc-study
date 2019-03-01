package BlackJack;


public class Dealer extends Person{

    public Dealer(DeckOfCards allCards, Card myCard) {
        super(allCards, myCard);
    }

    public void moreCards() {
        while (getValueOfAHand() < 17) {
            setPerson();
        }
        System.out.println("Dealer\n" + getPerson() + " : " + getValueOfAHand() + "\n");
        if (getValueOfAHand() > 21) {
            setIsBust();
        }
    }
}
