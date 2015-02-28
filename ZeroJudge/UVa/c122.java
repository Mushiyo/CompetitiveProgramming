/* Filename: c122.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class c122 {
	public static void main(String[] args) {
		long[] humbleNum = new long[5842 + 1];
		final int[] factors = { 2, 3, 5, 7 };
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Arrays.asList(1L));
		Set<Long> apperedUglyNumbers = new HashSet<Long>();

		// find all humble numbers between 1 ~ 5842
		int countUgly = 1;
		while (countUgly < humbleNum.length) {
			long currentUgly = pq.poll();

			if (!apperedUglyNumbers.contains(currentUgly)) {
				humbleNum[countUgly++] = currentUgly;
				apperedUglyNumbers.add(currentUgly);
				for (int i = 0; i < factors.length; ++i) {
					pq.add(currentUgly * factors[i]);
				}
			}
		}

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}

			if (n % 100 < 11 || n % 100 > 20) {
				switch (n % 10) {
				case 1:
					System.out.printf("The %dst humble number is %d.\n", n,
							humbleNum[n]);
					break;
				case 2:
					System.out.printf("The %dnd humble number is %d.\n", n,
							humbleNum[n]);
					break;
				case 3:
					System.out.printf("The %drd humble number is %d.\n", n,
							humbleNum[n]);
					break;
				default:
					System.out.printf("The %dth humble number is %d.\n", n,
							humbleNum[n]);
					break;
				}
			} else {
				System.out.printf("The %dth humble number is %d.\n", n,
						humbleNum[n]);
			}
		}
	}
}
