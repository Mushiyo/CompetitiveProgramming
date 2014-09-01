/* Filename: d221.java
 * Author: Mushiyo
 */
package UVa;

import java.util.PriorityQueue;
import java.util.Scanner;

public class d221 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N == 0) {
				break;
			}

			PriorityQueue<Long> priorityQueue = new PriorityQueue<Long>();

			while (N > 0) {
				priorityQueue.add(input.nextLong());

				--N;
			}

			long cost = 0;
			while (priorityQueue.size() >= 2) {
				long num1 = priorityQueue.poll();
				long num2 = priorityQueue.poll();

				cost += num1 + num2;

				priorityQueue.add(num1 + num2);
			}

			System.out.println(cost);
		}
	}

}
