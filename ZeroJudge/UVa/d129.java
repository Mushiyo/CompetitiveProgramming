/* Filename: d129.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class d129 {

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
