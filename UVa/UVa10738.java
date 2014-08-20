/* Filename: UVa10738.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa10738 {
	static final int SIZE = 1000000 + 1;
	static int[] mu = new int[SIZE];
	static int[] M = new int[SIZE];
	final static int prime = -1;
	final static int composite = 2;
	final static int notSquareFree = 0;
	final static int squareFreeAndEven = 1;
	final static int squareFreeAndOdd = -1;

	static void computeMuAndM() {
		Arrays.fill(mu, -1);
		mu[1] = 1;
		M[1] = 1;

		int sqrtSize = (int) Math.sqrt(SIZE) + 1;

		// sieve all the prime
		for (int i = 2; i < sqrtSize; ++i) {
			if (mu[i] == prime) {
				for (int j = i * i; j < SIZE; j += i) {
					mu[j] = composite;
				}
			}
		}

		for (int n = 2; n < SIZE; ++n) {
			if (mu[n] == composite && mu[n] != notSquareFree) {
				int currentN = n;
				int sqrtN = (int) Math.sqrt(n);
				int factorNum = 0;

				for (int i = 2; i <= sqrtN; ++i) {
					if (currentN % i == 0) {
						++factorNum;
					}

					int countFactor = 0;
					while (currentN % i == 0 && countFactor < 2) {
						++countFactor;
						currentN /= i;
					}

					// if n is not square free, all the multiples of n is not
					// square free
					if (countFactor >= 2) {
						for (int multipleN = n; multipleN < SIZE; multipleN += n) {
							mu[multipleN] = notSquareFree;
						}

						break;
					}
				}
				
				if(currentN != 1){
					++factorNum;
				}

				if (mu[n] != notSquareFree) {
					if (factorNum % 2 == 1) {
						mu[n] = squareFreeAndOdd;
					} else {
						mu[n] = squareFreeAndEven;
					}
				}
			}
		}

		// compute M[n]
		for (int i = 2; i < M.length; ++i) {
			M[i] = M[i - 1] + mu[i];
		}
	}

	public static void main(String[] args) {
		computeMuAndM();
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.printf("%8d%8d%8d\n", n, mu[n], M[n]);
		}
	}

}
