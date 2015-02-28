/* Filename: d713.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Arrays;

public class d713 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PriorityQueue<Long> smallHalf = new PriorityQueue<Long>(1,
				Collections.reverseOrder()); // a max-heap
		PriorityQueue<Long> largeHalf = new PriorityQueue<Long>(); // a min-heap

		boolean isEven = true;
		while (input.hasNext()) {
			long number = input.nextLong();
			isEven = !isEven;

			if (largeHalf.isEmpty()) {
				largeHalf.add(number);
			} else if (smallHalf.isEmpty()) {
				smallHalf.add(number);
			} else {
				smallHalf.add(number);

				while (smallHalf.peek() > largeHalf.peek()) {
					long tmp1 = smallHalf.poll();
					long tmp2 = largeHalf.poll();
					smallHalf.add(tmp2);
					largeHalf.add(tmp1);
				}

				while (largeHalf.size() < smallHalf.size()) {
					largeHalf.add(smallHalf.poll());
				}
			}

			if (isEven) {
				System.out
						.println(((long) smallHalf.peek() + largeHalf.peek()) / 2L);
			} else { // isOdd
				System.out.println(largeHalf.peek());
			}
		}
	}
}