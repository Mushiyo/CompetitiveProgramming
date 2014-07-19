/* Filename: a626.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class a626 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final List<Integer> primes = primeListOfRange(1100);
		// in case index out of bound, declare 1100 instead 1000 here

		while (input.hasNext()) {
			int N = input.nextInt();
			int currentPrime = primes.get(0);
			int primeCount = 1;
			
			while(currentPrime <= N){
				for(int i = 0; i < 5 && currentPrime <= N; ++i){
					System.out.printf("%10d", currentPrime);
					currentPrime = primes.get(primeCount);
					++primeCount;
				}
				System.out.println();
			}
		}
	}
	
	public static ArrayList<Integer> primeListOfRange(int upperbound) {
		boolean[] isPrime = new boolean[upperbound];

		for (int i = 2; i < upperbound; ++i) {
			isPrime[i] = true;
		}

		int sqrtSize = (int) Math.sqrt(upperbound) + 1;

		for (int i = 2; i < sqrtSize; ++i) {
			if (isPrime[i] == true) {
				for (int j = i * i; j < upperbound; j += i) {
					isPrime[j] = false;
				}
			}
		}

		ArrayList<Integer> prime = new ArrayList<Integer>();
		for (int i = 2; i < upperbound; ++i) {
			if (isPrime[i]) {
				prime.add(i);
			}
		}

		return prime;
	}

}
