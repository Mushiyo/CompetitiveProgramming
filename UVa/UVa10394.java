/* Filename: UVa10394.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class UVa10394 {
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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		ArrayList<Integer> prime = primeList(20000000);
		//Map<Integer, Integer> twinPrimeDict = new HashMap<Integer, Integer>();
		int[] twinPrimeDict = new int[100000 + 1];
		int countTwinPrime = 1;
		
		for(int i = 1; i < prime.size() && countTwinPrime <= 100000; ++i){
			if(prime.get(i) - prime.get(i - 1) == 2){
				twinPrimeDict[countTwinPrime] = prime.get(i - 1);
				//twinPrimeDict.put(countTwinPrime, prime.get(i - 1));
				++countTwinPrime;
			}
		}

		while (input.hasNext()) {
			int S = input.nextInt();
			
			int p1 = twinPrimeDict[S];
			int p2 = p1 + 2;
			out.append(String.format("(%d, %d)\n", p1, p2));
		}
		
		System.out.print(out);
	}

}
