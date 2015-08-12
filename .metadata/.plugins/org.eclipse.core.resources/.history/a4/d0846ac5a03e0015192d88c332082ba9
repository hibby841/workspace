package cardGameAPI;

public class Card {
	
	// named constants for the suits
	final static int HEARTS = 0;
	final static int SPADES = 1;
    final static int CLUBS = 2;
    final static int DIAMONDS = 3;
	final static int JOKER = 4;
	
	//named constants for the named card values ex. ace
	private final static int ACE = 1;
	private final static int JACK = 11;
	private final static int QUEEN = 12;
	private final static int KING = 13;
	
	//final instance variables 
	private final int suit;
	private final int value;
	
	public Card(){ //default constructor sets suit to joker and value to 1
		suit = JOKER;
		value = 1;
	}
	
	/**
	 * 
	 * @param suit, the first param, is an int to represent the suit
	 * @param value, the second param, is an int for the value
	 */
	public Card(int suit, int value){
		if(suit != SPADES && suit != HEARTS && suit != CLUBS && suit != DIAMONDS && suit != JOKER){
			throw new IllegalArgumentException("not a valid suit");
		}else if(suit != JOKER && (value < 1 || value > 13) ){
			throw new IllegalArgumentException("invalid value for card");
		}
		this.suit = suit;
		this.value = value;
	}
	
	
	public int getSuit(){
		return suit;
	}
	
	
	public int getValue(){
		return value;
	}
	
	//returns a string representation of the suit
	public String suitAsString(){
		switch(suit){
		case SPADES:
			return "Spade";
		case CLUBS:
			return "Clubs";
		case HEARTS:
			return "Hearts";
		case DIAMONDS:
			return "Diamond";
		default:
			return "Joker";
		}
	}
	
	
	//returns a string representation of the suit
	public String valueAsString(){
		switch(value){
		case ACE:
			return "Ace";
		case JACK:
			return "Jack";
		case QUEEN:
			return "Queen";
		case KING:
			return "King";
		case 2:
			return "2";
		case 3:
			return "3";
		case 4:
			return "4";
		case 5:
			return "5";
		case 6:
			return "6";
		case 7:
			return "7";
		case 8:
			return "8";
		case 9:
			return "9";
		default:
			return "10";
		}
	}
	
	
	public String toString(){
		if(suit == JOKER){
			if(value == 1){
				return "Joker";
			}else{
				return "Joker #" + valueAsString();
			}
		}else{
			return valueAsString() + " of " + suitAsString();
		}
	}


}



