package BlackJack;

public class TwentyOne {
    public static void main(String[] args) {

        DeckOfCards dCards = new DeckOfCards();
        Card aCard = new Card();
        Player p1 = new Player(dCards, aCard);
        Dealer d1 = new Dealer(dCards, aCard);


        // 0. set playing cards on the deck
        dCards.setCardOfDeck();


        // 1. deal two cards for player(both face up) and dealer(one face up)
        p1.drawACard();
        d1.drawACard();
        System.out.println("Dealer\n" + d1.getTheDrawnCard() + "\n");
        p1.drawACard();
        d1.drawACard();
        System.out.println("Player\n" + p1.getTheDrawnCard() + " : " + p1.getValueOfAHand() + "\n");


        // 2. player: hit or stand. If player has a blackjack skip here, if bust dealer will win
        if (p1.isBJ()) {
            System.out.println("BLACK JACK!!!\n");
        }
        if (d1.isBJ()) {
            System.out.println("Dealer\n" + d1.getTheDrawnCard() + " : " + d1.getValueOfAHand() + "\n");
            System.out.println("Dealer has a BLACK JACK!!!\n");
        }
        if (!p1.isBJ() && !d1.isBJ()){
            p1.hitOrStand();
        }


        // 3. dealer: draw cards until equal or over 17
        if (!p1.isBust() && !p1.isBJ() && !d1.isBJ()) {
            d1.drawMoreCards();

        }

        // 4. check who is winner
        if (p1.isBust()) {
            System.out.println("BUST!!\nYOU LOSE....");
        } else if (d1.isBust()) {
            System.out.println("The dealer dose bust!!\nYOU WIN!!");
        } else if (p1.getValueOfAHand() > d1.getValueOfAHand()) {
            System.out.println("YOU WIN!!");
        } else if (p1.getValueOfAHand() < d1.getValueOfAHand()) {
            System.out.println("YOU LOSE....");
        } else {
            System.out.println("EVEN");
        }

    }
}
