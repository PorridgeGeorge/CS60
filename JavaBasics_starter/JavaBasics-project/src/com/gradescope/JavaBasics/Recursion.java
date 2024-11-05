package com.gradescope.JavaBasics;

public class Recursion {

	/**
	 * Determines the number of ways to choose k unordered items from a list of n
	 *  Called "n choose k" in combinatorics
     *  (n choose k) = n! / (k!(n-k)!), where ! is the factorial operation
     *  For example, (4 choose 2) = 6 because there are six ways to choose
     *  two dwarves from a list of four (Happy, Sleepy, Grumpy, Dopey):
     *  1: (Happy, Sleepy) 2: (Happy, Grumpy) 3: (Happy, Dopey)
     *  4: (Sleepy, Grumpy) 5: (Sleepy, Dopey) 6:(Grumpy, Dopey)
	 * 
     *  This is a recursive implementation of "choose"
     * 
	 * @param n - a positive integer indicating the number of items in a list
	 * @param k - a nonnegative integer <= n indicating the number of itmes to choose
	 * @return (n choose k)
	 */
	public static int choose(int n, int k) {
		if (n < k) {
			return 1;
		}
		else{
			return ((choose((n-1),k) * k) * n) / (n-k);
		}
	}

	public static void main(String[] args) {
		// You can add debugging statements here to test your methods!
	}

}
