import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public int cardTotal(){
        return this.hand.size();
    }

    public int cardHasValue(Card card){

        return card.getValueFromEnum();
    }


}
