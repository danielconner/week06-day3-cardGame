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
        for (each : SuitType.values()){
            for (each : ValueType.values())
                this.deck.add(card);
        }
    }



}
