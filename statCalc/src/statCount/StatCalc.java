package statCount;

/**
 * An object of class StatCalc can be used to compute several simple statistics
 * for a set of numbers. Numbers are entered into the dataset using the
 * enter(double) method. Methods are provided to return the following statistics
 * for the set of numbers that have been entered: The number of items, the sum
 * of the items, the average, and the standard deviation
 */

public class StatCalc {

	private int entryCount; // number of data entries
	private double sum; // sum of the data entries
	private double sumOfSquaredEntries; // sum when each of the data entries is
										// squared

	private double max = Double.NEGATIVE_INFINITY; // Largest item seen.
	private double min = Double.POSITIVE_INFINITY; // Smallest item seen.

	public void enter(double num) {
		entryCount = getEntryCount() + 1; // increment entryCount
		setSum(getSum() + num); // update the sum
		sumOfSquaredEntries = getSumOfSquaredEntries() + num * num; // update sumOfSquared
		
		if (num > max)
			max = num;
		if (num < min)
			min = num;
	}

	/**
	 * returns the average of entries
	 */
	public double mean() {
		return sum / entryCount;
	}

	/**
	 * Return the standard deviation of all the items that have been entered.
	 * The return value is Double.NaN if no numbers have been entered.
	 */
	public double deviation() {
		double mean = mean();
		return Math.sqrt((sumOfSquaredEntries / entryCount) - (mean * mean));
	}

	/**
	 * Return the smallest item that has been entered. The return value will be
	 * infinity if no numbers have been entered.
	 */
	public double getMin() {
		return min;
	}

	/**
	 * Return the largest item that has been entered. The return value will be
	 * -infinity if no numbers have been entered.
	 */
	public double getMax() {
		return max;
	}

	/**
	 * for if you wanna extend this class and add to sum in a non-incremental
	 * manor
	 * @param sum is the new value to set sum as WARNING! this will override current sum by default
	 */
	public void setSum(double sum) {
		this.sum = sum;
	}

	//
	// Getters for entryCount, sum, and sumOfSquared

	public int getEntryCount() {
		return entryCount;
	}

	public double getSum() {
		return sum;
	}

	public double getSumOfSquaredEntries() {
		return sumOfSquaredEntries;
	}

}
