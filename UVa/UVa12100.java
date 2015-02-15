/* Filename: UVa12100.java
 * Author: Mushiyo
 */

import java.util.Collections;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class UVa12100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int caseNum = input.nextInt();

			while (caseNum > 0) {
				int n = input.nextInt();
				int m = input.nextInt();

				Queue<Integer> printJob = new LinkedList<Integer>();
				PriorityQueue<Integer> priorityJob = new PriorityQueue<Integer>(
						n, Collections.reverseOrder());
				for (int i = 0; i < n; ++i) {
					int priority = input.nextInt();
					printJob.add(priority);
					priorityJob.add(priority);
				}

				int time = 0;
				while (true) {
					int currentJob = printJob.poll();
					if (priorityJob.peek() > currentJob) {
						printJob.add(currentJob);

					} else if (priorityJob.peek() == currentJob) {
						priorityJob.poll();
						++time;
						
						if (m == 0) {
							break;
						}
					}

					--m;
					m += printJob.size();
					m %= printJob.size();
				}

				System.out.println(time);

				--caseNum;
			}
		}
	}

}
