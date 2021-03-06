package diceTest;

public class PairOfDice {

	private int die1; // number showing on the first die
	private int die2; // number showing on the second die

	public PairOfDice() {
		// constructor. creates a pair of dice
		// with random "shown" values
		roll();
	}
	
	
	public PairOfDice(int show1, int show2){
		setDie1(show1);
		setDie2(show2);
	}
	

	public void roll() {
		setDie1((int) (6 * Math.random()) + 1); // assigns the numbers showing
												// on the
		setDie1((int) (6 * Math.random()) + 1); // dice to a random number
												// between 1 and 6
	}

	
	
	/**
	 * these are the getters and setters for die1 and die2 ... obviously
	 */
	public int getDie1() {
		return die1;
	}

	public void setDie1(int die1) {
		this.die1 = die1;
	}

	public int getDie2() {
		return die2;
	}

	public void setDie2(int die2) {
		this.die2 = die2;
	}

}
