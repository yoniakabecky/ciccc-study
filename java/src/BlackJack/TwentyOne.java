package BlackJack;

public class TwentyOne {
    public static void main(String[] args) {

        DeckOfCards dCards = new DeckOfCards();
        Card aCard = new Card();
        Player p1 = new Player(dCards, aCard);
        Dealer d1 = new Dealer(dCards, aCard);


        // 0. set playing cards on the deck
        dCards.setCardOfDeck();


        // 1. give two cards for player(both face up) and dealer(one face up)
        p1.setPlayer();
        d1.setPerson();
        System.out.println("Dealer\n" + d1.getPerson() + "\n");
        p1.setPlayer();
        d1.setPerson();
        System.out.println("Player\n" + p1.getPlayer() + " : " + p1.getPlayerSum() + "\n");


        // 2. player: hit or stand. If blackjack skip, if bust dealer win
        if (p1.isBj()) {
            System.out.println("Black Jack!!!\n");
        } else {
            p1.hitOrStand();
        }


        // 3. dealer: draw cards until equal or over 17
        if (!p1.isBust()) {
            d1.moreCards();

        }

        // 4. check which is winner
        if (p1.isBust()) {
            System.out.println("BUST!!\nYOU LOSE....");
        } else if (d1.isBust()) {
            System.out.println("The dealer dose bust!!\nYOU WIN!!");
        } else if (p1.getPlayerSum() > d1.getValueOfAHand()) {
            System.out.println("YOU WIN!!");
        } else if (p1.getPlayerSum() < d1.getValueOfAHand()) {
            System.out.println("YOU LOSE....");
        } else {
            System.out.println("EVEN");
        }

    }
}
