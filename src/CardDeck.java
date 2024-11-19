public class CardDeck {
   private Card[] cards;    //getset

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public CardDeck() {
        cards = new Card[52];
        for(int i = 0; i<13; i++) {     //0 - 12
            cards[i] = new Card(i+1,"Heart");
        }
        for(int i = 13; i<26; i++) {    //13 - 26
            cards[i] = new Card(i-13+1,"Diamond");
        }
        for(int i = 26; i<39; i++) {    //27 - 40
            cards[i] = new Card(i-26+1,"Spade");
        }
        for(int i = 39; i<52; i++) {
            cards[i] = new Card(i-39+1,"Club");
        }
    }
}
