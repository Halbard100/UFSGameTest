public class Node {

    BaseCard card;
    Node next;
    Node prev;

    public Node(){

    }
    public Node(BaseCard card){
        this.card = card;
        next = null;
        prev = null;
    }

}
