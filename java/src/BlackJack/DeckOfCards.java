package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List deckOfCards;
    private String aCard;

    public DeckOfCards() {

    }

    public List getCardOfDeck() {
        return deckOfCards;
    }

    public String getaCard() {
        return aCard;
    }

    public void setCardOfDeck() {
        List allCards = new ArrayList();
        for (int i = 0; i < 52; i++) {
            allCards.add(i + 1);
        }
        Collections.shuffle(allCards);
        Collections.shuffle(allCards);
        this.deckOfCards = allCards;
    }

    public void setaCard() {
        this.aCard = deckOfCards.get(0).toString();
    }

    public void removeACard() {
        deckOfCards.remove(0);
    }
}
