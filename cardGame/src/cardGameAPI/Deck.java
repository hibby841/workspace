package cardGameAPI;

public class Deck {
	//instance variables for the card array, and cardsUsed
	private Card[] deck;
	private int cardsUsed = 0;
	
	public Deck(boolean includeJokers){
		if(!includeJokers){
			deck = new Card[52];
		}else{
			deck = new Card[54];
			deck[52] = new Card(Card.JOKER, 1);
			deck[53] = new Card(Card.JOKER, 2);
		}
		int cardCT = 0; // var too keep track of the number of cards
		for(int i = 0; i <= 3; i++){
			for(int j = 1; j <= 13; j++){
				deck[cardCT] = new Card(i, j);
				cardCT++;
			}
		}
		
		cardsUsed = 0;
	}
	
	/**
	 * no params, shuffles the deck and resets the cardsUsed to 0
	 */
	public void shuffle(){
		for(int i = deck.length - 1; i >= 0; i--){
			int rand = (int) ( (i + 1) * Math.random() );
			Card tempCard = deck[i];
			deck[i] = deck[rand];
			deck[rand] = tempCard;
		}
		cardsUsed = 0;
	}
	
	/** 
	 * @returns the number of cards left for use in the deck
	 */
	public int cardsLeft(){
		return deck.length - cardsUsed;
	}
	
	/**
	 * takes no params
	 * @returns the next card in the deck
	 */
	public Card dealCard(){
		Card dealtCard;
		if(cardsUsed == deck.length){
			throw new IllegalArgumentException("no more cards to use");
		}
		dealtCard = deck[cardsUsed];
		if(dealtCard == null){
			System.out.println("WTF!! i dealt a null card at deck index" + cardsUsed + "?!?");
		}
		cardsUsed++;
		return dealtCard;
	}
	
	
	public boolean hasJokers(){
		return (deck.length == 54);
	}
	
}
