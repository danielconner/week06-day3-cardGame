import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();

    }
}
