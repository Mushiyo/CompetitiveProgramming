/* Filename: UVa136.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Arrays;

public class UVa136 {

	public static void main(String[] args) {
		final int[] factors = { 2, 3, 5 };
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Arrays.asList(1L));
		Set<Long> apperedUglyNumbers = new HashSet<Long>();

		int countUgly = 0;
		long currentUgly = 0;
		while (countUgly < 1500) {
			currentUgly = pq.poll();

			if (!apperedUglyNumbers.contains(currentUgly)) {
				++countUgly;
				apperedUglyNumbers.add(currentUgly);
				for (int i = 0; i < factors.length; ++i) {
					pq.add(currentUgly * factors[i]);
				}
			}
		}

		System.out.printf("The 1500'th ugly number is %d.\n", currentUgly);
	}
}
