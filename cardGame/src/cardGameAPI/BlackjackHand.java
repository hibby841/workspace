package cardGameAPI;

public class BlackjackHand extends Hand {

	public int getBlackjackValue(){
	    int val = 0; //value computed for hand
	    boolean ace = false; //boolean to track aces
	    int cards = 0; //num of cards in hand
	
	    cards = cardCount();
	    for(int i = 1; i <= cards; i++){
		    Card card = getCard(i); //the i-th card
		    int cardVal; //the blackjack value of the card
		
		    cardVal = card.getValue(); //normal values 1 to 13
		    if(cardVal > 10){
		    	cardVal = 10;
		    }else if(cardVal == 1){
		    	ace = true;
		    }
		    val += cardVal;
	    }
	    
	    // Now, val is the value of the hand, counting any ace as 1.
        // If there is an ace, and if changing its value from 1 to 
        // 11 would leave the score less than or equal to 21,
        // then do so by adding the extra 10 points to val. 
	    if(ace == true && val + 10 <= 21){
	    	val += 10;
	    }
	    return val;
	}
}
