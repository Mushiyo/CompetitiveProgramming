//TLE

/* Filename: UVa10311.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UVa10311 {
	private static int upperBound = 100000000 + 1;
	static boolean[] isPrime = new boolean[upperBound];	

	public static ArrayList<Integer> primeList() {
		Arrays.fill(isPrime, true);

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

	public static void main(String[] args) {
		ArrayList<Integer> prime = primeList();
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();

		while (input.hasNext()) {
			int n = input.nextInt();
			int startPoint = Collections.binarySearch(prime, n / 2);
			boolean solutionFound = false;

			if (startPoint < 0) {
				startPoint = -(startPoint + 1);
			}

			for (int i = startPoint; i < prime.size() && prime.get(i) < n; ++i) {
				if (isPrime[n - prime.get(i)]) {
					out.append(String.format("%d is the sum of %d and %d.\n", n, n
							- prime.get(i), prime.get(i)));
					solutionFound = true;
					break;
				}
			}
			
			if(solutionFound == false){
				out.append(String.format("%d is not the sum of two primes!\n", n));
			}
		}
		
		System.out.print(out);
	}

}
