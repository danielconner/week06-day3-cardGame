import org.junit.Before;

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




}
