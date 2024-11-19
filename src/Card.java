public class Card {
   private int value;       //getset
    private String suit;    //getset

    public Card(int value, String suit ){
        this.suit = suit;
        this.value = value;
    }
///////////////////getset
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
