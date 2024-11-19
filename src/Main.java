public class Main {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        for (int i = 0; i < 52; i++) {
            Card card = cardDeck.getCards()[i]; //getset
            System.out.println(card.getSuit() + " " + card.getValue()); //getset
        }

    }
}