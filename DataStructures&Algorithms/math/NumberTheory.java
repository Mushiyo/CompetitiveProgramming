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
	 * Return the sum of digitis of {@code n}
	 * 
	 * @param n
	 *            a number.
	 * @return the sum of digitis of {@code n}
	 */
	public static int digitSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

	public static int digitSum(long n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

	/**
	 * Return the number of positive integers which is less than or equal to n
	 * that are relatively prime to n.
	 * 
	 * @param n
	 *            a positive integer
	 * @return the number of n's relative prime between 1 ~ n
	 */
	public static int eulersTotient(int n) {
		int sqrtN = (int)Math.sqrt(n);
		int relPrimeNum = n;

		if (n % 2 == 0) {
			relPrimeNum -= relPrimeNum / 2;

			while (n % 2 == 0) {
				n /= 2;
			}
		}

		for (int i = 3; i <= sqrtN && n != 1; i += 2) {
			if (n % i == 0) {
				relPrimeNum -= relPrimeNum / i;

				while (n % i == 0) {
					n /= i;
				}
			}
		}
		
		if(n != 1){
			relPrimeNum -= relPrimeNum / n;
		}

		return relPrimeNum;
	}
	
	public static ArrayList<Integer> factor(int n) {
		ArrayList<Integer> factor = new ArrayList<Integer>();

		for (int i = 2; i <= n; ++i) {
			if (n % i == 0) {
				factor.add(i);
			}
		}

		return factor;
	}

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

	// !!! under construction
	/**
	 * Return a list of primes between {@code lower bound} ~ {@code upper bound}
	 * . Primes are find with the sieve of Eratosthenes.
	 * 
	 * @param lowerBound
	 *            the number which the first prime in the returned list large
	 *            than or equals to.
	 * @param upperBound
	 *            the number which the last prime in the returned list does not
	 *            exceed.
	 * @return a list of primes between 1 ~ {@code upper bound}.
	 */
	public static ArrayList<Integer> primeListOfRange(int lowerBound,
			int upperBound) {
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

	// public static void main(String[] args) {
	// //primeList(100000000);
	// System.out.println(eulersTotient(7654321));
	// }
}
