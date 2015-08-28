/* Filename: Sequence.java
 * Author: Mushiyo
 */
package math;

public class Sequence {
	/*
	 * return the sum of a finite arithmetic progression (AP)
	 */
	public static long finiteAPSum(int firstTerm, int lastTerm, int height){
		return ((firstTerm + lastTerm) * height) / 2;
	}
	
	/*
	 * return the sum of 1^2 + 2^2 + ... + n^2
	 */
	public static long sumOfSquare(int n){
		return (n * (n + 1) * (2 * n + 1)) / 6;
	}
	
	/*
	 * return the sum of 1^3 + 2^3 + ... + n^3
	 */
	public static long sumOfCube(int n){
		long root = finiteAPSum(1, n, n);
		return root * root;
	}
}
