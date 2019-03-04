package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DeckOfCards {

    private List deckOfCards;
    private String aCard;


    DeckOfCards() {

    }


    void setCardOfDeck() {
        List allCards = new ArrayList();
        for (int i = 0; i < 52; i++) {
            allCards.add(i + 1);
        }
        Collections.shuffle(allCards);
        Collections.shuffle(allCards);
        this.deckOfCards = allCards;
    }

    String getACard() {
        return aCard;
    }

    void setACard() {
        this.aCard = deckOfCards.get(0).toString();
        deckOfCards.remove(0);
    }
}
