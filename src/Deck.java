import java.util.ArrayList;

public class Deck {

    ArrayList<BaseCard> deck;
    Node top;
    Node bottom;
    int deckSize = 0;


    /**
     * Create an empty deck
     */
    public Deck(){
        top = null;
        bottom = null;
        top = bottom;
    }

    /**
     * Creat a deck from an array of cards
     * @param card An array of cards that make up the deck.
     */
    public Deck(BaseCard card[]){
        for (int i = 0; i < card.length; i++){
            addCard(card[i]);
            deckSize++;
        }
    }

    public void addCard(BaseCard card){
        bottom = new Node(card);
        bottom = bottom.next;

    }

    /**
     * Returns the top card of the deck and removes it from the deck.
     * @return the top card of the deck
     */
    public Node draw(){
        Node ret = top;
        top = top.next;
        return ret;
    }
    
    public void shuffle(){
        int stackSizeOne = deckSize/2;
        int stackSizeTwo = deckSize - stackSizeOne;
        for (int i = 0; i < stackSizeOne; i++){

        }

    }


}
