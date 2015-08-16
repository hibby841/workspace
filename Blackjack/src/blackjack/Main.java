package blackjack;


public class Main {
	
	public static void main(String[] args) {
		int numOfWins = 0;
		int numOfPlays = 0;
		int numOfLosses = 1;
		String playAgain;
		System.out.println("thanks for playin... you start with 2 cards");
		System.out.println("and you can type sort to sort your hand by card value");
		System.out.println();
		boolean yaOrNa;
		do{
			numOfPlays++;
			yaOrNa = false;
		    boolean won = false;
		    won = Game.run();
		    if(won == true){
			    System.out.println("CONGRATZ!!! you won");
			    numOfWins++;
		    }else{
			    System.out.println("FAIL!!! you lost");
			    System.out.println();
			    numOfLosses++;
		    }
		    System.out.println("would you like another go?.. 'yes' or 'no'?:");
		    do{
		    	playAgain = Game.nextLine();
		    	if(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("true") || playAgain.equalsIgnoreCase("no") || playAgain.equalsIgnoreCase("false") ){
		    		if(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("true") ){
		    		    yaOrNa = true;
		    		}
		    	}else{
		    		System.out.println("invalid response");
		    	}
		    }while(!(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("true") || playAgain.equalsIgnoreCase("no") || playAgain.equalsIgnoreCase("false")) );
		    
		}while(yaOrNa);
		
		double ans = 0;
		
		try{
			ans = (double)numOfWins / numOfLosses;
		}catch(Exception e){
			if(numOfWins == numOfLosses){
				ans = 1.0;
			}else if(numOfWins == 0){
				ans = 0;
			}else if(numOfLosses == 0){
				ans = numOfWins;
			}
		}
		
		System.out.println("you won " +  numOfWins + " times out of " + numOfPlays + " plays");
		System.out.print("your win to loss ratio is " + ans);
	}
}
