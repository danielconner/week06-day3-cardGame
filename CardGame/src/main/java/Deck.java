import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;



    public Deck(){
        this.deck = new ArrayList<>();

    }

    public int numberOfCards(){
         return this.deck.size();
    }

    public void addCard(Card card){
        this.deck.add(card);
    }

    public void populateDeck(){
        for (SuitType suit: SuitType.values()){
            for (ValueType value: ValueType.values())
                this.deck.add(new Card(suit, value));
        }
    }

    public Card getCardFromIndex(int index){
        Card card = this.deck.get(index);
        return card;
    }

    public void shufflePack(){
        Collections.shuffle(this.deck);
    }

    public Card deal(int index){
        Card card1 = this.deck.remove(index);
        return card1;
    }





}
