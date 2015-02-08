/* Filename: UVa10107.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class UVa10107 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PriorityQueue<Integer> smallHalf = new PriorityQueue<Integer>(1,
				Collections.reverseOrder()); // a max-heap
		PriorityQueue<Integer> largeHalf = new PriorityQueue<Integer>(); // a min-heap

		boolean isEven = true;
		while (input.hasNext()) {
			int number = input.nextInt();
			isEven = !isEven;

			if (largeHalf.isEmpty()) {
				largeHalf.add(number);
			} else if (smallHalf.isEmpty()) {
				smallHalf.add(number);
			} else {
				smallHalf.add(number);

				while (smallHalf.peek() > largeHalf.peek()) {
					int tmp1 = smallHalf.poll();
					int tmp2 = largeHalf.poll();
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
