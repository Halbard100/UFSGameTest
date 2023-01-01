import java.util.ArrayList;

public class Hand {
    ArrayList<BaseCard> hand;

    public Hand(){

    }

    public void addCard(BaseCard card){
        hand.add(card);
    }
}
