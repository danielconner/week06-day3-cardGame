import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Deck deck;
    Card card;
    Hand hand;

    @Before
    public void before(){
        hand = new Hand();
        deck = new Deck();
        card = new Card(SuitType.DIAMONDS, ValueType.FIVE);
    }

    @Test
    public void canAddCardToHand(){
        deck.populateDeck();
        Card card1 = deck.deal(0);
        hand.addCard(card1);
        assertEquals(1, hand.cardTotal());
    }

    @Test
    public void cardHasValue(){
        deck.populateDeck();
        Card card1 = deck.deal(0);
        hand.addCard(card1);
        assertEquals(1, hand.cardHasValue(card1));
    }




}
