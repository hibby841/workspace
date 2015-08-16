package blackjack;

import java.util.Scanner;

import cardGameAPI.BlackjackHand;
import cardGameAPI.Deck;

public class Game {
	
	
	public static boolean run(){  //returns a true if player wins game
		Deck deck = new Deck(false);
		deck.shuffle();
		BlackjackHand player = new BlackjackHand();
		BlackjackHand cpu = new BlackjackHand();
		
		for(int i = 0; i < 2; i++){
			player.addCard(deck.dealCard());
			cpu.addCard(deck.dealCard());
		}
		player.displayHand();
		
		if(player.getBlackjackValue() == 21){
			return true;
		}else if(cpu.getBlackjackValue() == 21){
			System.out.println("players hand = " + player.getBlackjackValue() + " :cpu's hand = " + cpu.getBlackjackValue());
			return false;
		}
		// loop for "hit or stand"
		while(true){
			System.out.println("would you like to \"hit\" or \"stand\"");
			
			boolean validAns = false; //keeps track of weather or not user answers right
			String ans; //answer
			
			do{
				ans = nextLine();
				if(!(ans.equalsIgnoreCase("hit") || ans.equalsIgnoreCase("stand") || ans.equalsIgnoreCase("sort")) ){
					validAns = false;
					System.out.println("invalid response");
				}else{
					validAns = true;
				}
			}while(validAns == false);
			
			if(ans.equalsIgnoreCase("hit")){
				player.addCard(deck.dealCard());
				cpu.addCard(deck.dealCard());
				player.displayHand();
			}else if(ans.equalsIgnoreCase("stand")){
				player.displayHand();
				if(player.getBlackjackValue() == 21 || player.getBlackjackValue() > cpu.getBlackjackValue()){
					System.out.println("cpu's hand = " + cpu.getBlackjackValue() + " :players hand = " + player.getBlackjackValue());
					return true;
				}else if(cpu.getBlackjackValue() == 21 || cpu.getBlackjackValue() > player.getBlackjackValue() || cpu.getBlackjackValue() == player.getBlackjackValue()){
					System.out.println("players hand = " + player.getBlackjackValue() + " :cpu's hand = " + cpu.getBlackjackValue());
					return false;
				}
			}else if(ans.equalsIgnoreCase("sort")){
				player.sortByValue();
				player.displayHand();
			}
			
			if(cpu.getBlackjackValue() == 21 || player.getBlackjackValue() > 21 ){
				if(player.getBlackjackValue() > 21 ){
			        System.out.println("you went over at " + player.getBlackjackValue());
				}else{
					System.out.println("the cpu got " + cpu.getBlackjackValue());
				}
				return false;
			}else if(cpu.getBlackjackValue() > 21){
				System.out.println("the cpu went over at " + cpu.getBlackjackValue());
				return true;
			}
		}
	}


	@SuppressWarnings("resource")
	public static String nextLine() {
		Scanner stdin = new Scanner(System.in);
		String ans = stdin.nextLine();
		return ans;
	}
	
	

}