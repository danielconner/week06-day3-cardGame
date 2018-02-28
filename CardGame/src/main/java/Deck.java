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

    public void populateDeck(Card card){
        for (SuitType suit: SuitType.values()){
            for (ValueType value: ValueType.values())
                this.deck.add(card);
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
