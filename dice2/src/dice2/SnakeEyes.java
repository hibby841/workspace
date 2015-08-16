package dice2;

public class SnakeEyes {

	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice(); // new object of PairOfDice

		int rollCount = 0; // keeps track of the number of rolls
		do {
			dice.roll();
			rollCount++;
			if (rollCount % 10 == 0) {
				System.out.println(dice.toString() + " on roll number " + rollCount);
			}
		} while (dice.getTotal() != 2);
		System.out.println(dice.toString() + " on roll number " + rollCount);
		System.out.println();
	    System.out.println();		
		System.out.println("it took " + rollCount + " tries to get snake eyes");
	}

}