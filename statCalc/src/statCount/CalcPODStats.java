package statCount;

import java.util.Scanner;

public class CalcPODStats {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice(); //new POD object
		StatCalc stats; //create a variable to reference our StatCalcs
		
		int rollCount = 0; //keeps track of the number of rolls
		int countOf1stTry = 0; // stores when it gets a first try roll for the given number "i"
		boolean foundFirstTry = false; //boolean that stores weather or not its seen the first try roll yet
		
		for(int i = 2; i <= 12; i++){      //creates new StatCalc
			stats = new StatCalc();
			for(int j = 1; j <= 1000; j++){ //does the test 1000 times
				countOf1stTry++;
				do{
					dice.roll();
					rollCount++;
					if(dice.getTotal() == i && rollCount == 1 && !foundFirstTry){
						foundFirstTry = true;
					    System.out.println("it took " + countOf1stTry + " test iterations to get- " + i + " -on the first roll");
					    System.out.println();
					}
				}while(dice.getTotal() != i);
				
				stats.enter(rollCount); //enter the rollCount for this iteration
				rollCount = 0;	//reset the rollCount to get ready for next iteration
			}
			foundFirstTry = false; //reset to false to prepare for the next scenario
			countOf1stTry = 0; //reset to 0 to prepare for the next scenario
			
			
			System.out.println( "the average number of rolls it took for " + i + " is " + stats.mean() );
			System.out.println();
			System.out.print( "the standard deviation in rolls for " + i + " is ");
			System.out.printf( "%1.4f \n", stats.deviation() );
			System.out.println();
			System.out.println( "the max rolls it took for" + i + " is " + stats.getMax() );
			System.out.println();
			System.out.println("the min number of rolls it took for" + i + " is " + stats.getMin());
			System.out.println();
			System.out.println("press enter to continue...");
			nextLine();
			System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
			System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
			
			stats = null;
		}
		
	}

	private static String nextLine() {
		Scanner stdin = new Scanner(System.in);
		String str = stdin.nextLine();
		return str;
	}

}