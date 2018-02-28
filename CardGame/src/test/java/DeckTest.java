import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, ValueType.FIVE);
    }

    @Test
    public void canDeckStartEmpty(){
        assertEquals(0, deck.numberOfCards());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCard(card);
        assertEquals(1, deck.numberOfCards());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck(card);
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void canGetCardFromDeck(){
        deck.populateDeck(card);
        Card card1 = deck.getCardFromIndex(2);
        assertEquals(SuitType.DIAMONDS, card1.getSuit());
        assertEquals(5, card1.getValueFromEnum());
    }

    @Test
    public void deal(){
        deck.populateDeck(card);
        deck.shufflePack();
        deck.deal(0);
        assertEquals(51, deck.numberOfCards());
    }


}
