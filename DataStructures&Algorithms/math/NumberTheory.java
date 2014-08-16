/* Filename: NumberTheory.java
 * Author: Mushiyo
 */

/**
 * This class {@code NumberTheory} contains some number theory-related
 * algorithms.
 */

package math;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberTheory {

	/**
	 * Return the greatest common divisor of the two {@code int} values using
	 * the Euclidean algorithm.
	 * 
	 * @param a
	 *            an argument.
	 * @param b
	 *            another argument.
	 * @return the greatest common divisor of {@code a} and {@code b}.
	 */
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	/**
	 * Return the greatest common divisor of the two {@code long} values using
	 * the Euclidean algorithm.
	 * 
	 * @param a
	 *            an argument.
	 * @param b
	 *            another argument.
	 * @return the greatest common divisor of {@code a} and {@code b}.
	 */
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static BigInteger gcd(BigInteger a, BigInteger b) {
		return a.gcd(b);
	}

	/**
	 * Return the least common multiple of the two {@code int} values.
	 * 
	 * @param a
	 *            an argument.
	 * @param b
	 *            another argument.
	 * @return the least common multiple of {@code a} and {@code b}.
	 */
	public static int lcm(int a, int b) {
		// gcd(a, b) * lcm(a, b) = a * b
		// lcm(a, b) = (a * b) / gcd(a, b)
		// since a * b might overflow
		// so use a / gcd(a, b) * b
		return a / gcd(a, b) * b;
	}

	/**
	 * Return the least common multiple of the two {@code long} values.
	 * 
	 * @param a
	 *            an argument.
	 * @param b
	 *            another argument.
	 * @return the least common multiple of {@code a} and {@code b}.
	 */
	public static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}
	
	public static BigInteger lcm(BigInteger a, BigInteger b) {
		return a.divide(a.gcd(b)).multiply(b);
	}

	// !!! under construction
	/**
	 * Return a list of primes between {@code lower bound} ~ {@code upper bound}. Primes are find
	 * with the sieve of Eratosthenes.
	 * 
	 * @param lowerBound
	 *            the number which the first prime in the returned list large than or
	 *            equals to.
	 * @param upperBound
	 *            the number which the last prime in the returned list does not
	 *            exceed.
	 * @return a list of primes between 1 ~ {@code upper bound}.
	 */
	public static ArrayList<Integer> primeListOfRange(int lowerBound, int upperBound) {
		boolean[] isPrime = new boolean[upperBound];

		Arrays.fill(isPrime, 2, upperBound, true);

		int sqrtSize = (int) Math.sqrt(upperBound) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < upperBound; j += i) {
					isPrime[j] = false;
				}
			}
		}

		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i < upperBound; ++i) {
			if (isPrime[i]) {
				prime.add(i);
			}
		}

		return prime;
	}

	/**
	 * Return the first {@code size} primes in a list. Primes are find with the
	 * sieve of Eratosthenes.
	 * 
	 * @param size
	 *            the size of the list of primes.
	 * @return a list of primes with the specific size  
	 */
	public static ArrayList<Integer> primeList(int upperBound) {
		boolean[] isPrime = new boolean[upperBound];

		Arrays.fill(isPrime, 2, upperBound, true);

		int sqrtSize = (int) Math.sqrt(upperBound) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < upperBound; j += i) {
					isPrime[j] = false;
				}
			}
		}

		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i < upperBound; ++i) {
			if (isPrime[i]) {
				prime.add(i);
			}
		}

		return prime;
	}
	
//	public static void main(String[] args) {
//		primeList(100000000);
//	}
}
