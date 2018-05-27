/* Filename: Sequence.java
 * Author: Mushiyo
 */
package math;

public class Sequence {
	/*
	 * return the sum of a finite arithmetic progression (AP)
	 */
	public static long finiteAPSum(long firstTerm, long lastTerm, long height){
		return ((firstTerm + lastTerm) * height) / 2;
	}
	
	/*
	 * return the sum of the first natural numbers, i.e. 1 + 2 + ... + n
	 */
	public static long sumOfN(long n){
		return finiteAPSum(1, n, n);
	}
	
	/*
	 * return the sum of start + (start + 1) + ... + end
	 */
	public static long sumOfN(long start, long end){
		return finiteAPSum(start, end, end - start + 1);
	}
	
	/*
	 * return the sum of 1^2 + 2^2 + ... + n^2
	 */
	public static long sumOfSquare(long n){
		return (((n * (n + 1)) / 2) * (2 * n + 1)) / 3;
	}
	
	/*
	 * return the sum of start^2 + (start + 1)^2 + ... + end^2
	 */
	public static long sumOfSquare(long start, long end){
		return sumOfSquare(end) - sumOfSquare(start - 1);
	}
	
	/*
	 * return the sum of 1^3 + 2^3 + ... + n^3
	 */
	public static long sumOfCube(long n){
		long root = finiteAPSum(1, n, n);
		return root * root;
	}
	
	/*
	 * return the sum of start^3 + (start + 1)^3 + ... + end^3
	 */
	public static long sumOfCube(long start, long end){
		return sumOfCube(end) - sumOfCube(start - 1);
	}
	
	/*
	 * return the sum of (1^2 + 2^2 + ... + n^2) % m
	 */
	public static long sumOfSquareMod(long n, long m) {
		long sum = 0;

		if ((2 * n + 1) % 3 == 0) {
			return ((((n * (n + 1) / 2)) % m) * ((2 * n + 1) / 3)) % m;
		} else { // then either n % 3 == 0 or (n + 1) % 3 == 0
			return ((((n * (n + 1) / 6)) % m) * (2 * n + 1)) % m;
		}
	}
	
	/*
	 * return the sum of (1^3 + 2^3 + ... + n^3) % m
	 */
	public static long sumOfCubeMod(long n, long m){
		long root = finiteAPSum(1, n, n) % m;
		return (root * root) % m;
	}
}
