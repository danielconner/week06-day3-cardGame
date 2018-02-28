import java.util.ArrayList;

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
        return this.deck.get(index);
    }



}
