// WA

/* Filename: R1C2015A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class R1C2015A {
	static int[][] sol = {{},{0,1},{0,2,2},{0,3,3,3},{0,4,3,4,4},{0,5,4,4,5,5},{0,6,4,4,5,6,6},{0,7,5,5,5,6,7,7},{0,8,5,5,5,6,7,8,8},{0,9,6,6,6,6,7,8,9,9},{0,10,6,6,6,6,7,8,9,10,10}};

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("A-small-attempt4.in"));
		PrintWriter output = new PrintWriter(new File("pA.out"));
		// Scanner input = new Scanner(System.in);
		// PrintWriter output = new PrintWriter(System.out);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int R = input.nextInt();
				int C = input.nextInt();
				int W = input.nextInt();
				//int rowMin = 0;
				int min = 0;

//				PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
//						Collections.reverseOrder());
//				pq.add(C);
//
//				while (pq.peek() >= W) {
//					int len = pq.poll();
//
//					int right = (int) Math.ceil(len / 2.0);
//					int left = (int) Math.floor(len / 2.0);
//
//					if (left > right) {
//						--left;
//					} else {
//						--right;
//					}
//
//					pq.add(left);
//					pq.add(right);
//					++rowMin;
//				}
//				// output.println(pq.peek());
//				if (W == C) {
//					min = W;
//				} else if (W + W - 1 >= C) {
//					min = W + 1;
//				} else {
//					int left = 0;
//					if (pq.isEmpty() == false) {
//						left = pq.poll();
//					}
//
//					int right = 0;
//					if (pq.isEmpty() == false) {
//						right = pq.poll();
//					}
//
//					if (W + W - 1 >= right + 1 + left) {
//						min = W + 1;
//						min += rowMin - 1;
//					} else {
//						min = rowMin + W - 1;
//					}
//
//				}
//
//				min += (R - 1) * rowMin;

				// min += rowMin * R;
				// min += W - 1;
				// int left = 0;
				// if(pq.isEmpty() == false){
				// left = pq.poll();
				// }
				//
				// int right = 0;
				// if(pq.isEmpty() == false){
				// right = pq.poll();
				// }
				//
				//
				// if(right + 1 + left >= W){
				// ++min;
				// }

				// int[] a = new int[right + 1 + left];
				//
				// for(int i = 0, j = a.length - 1; i < W; ++i, --j){
				// ++a[i];
				// ++a[j];
				// }
				//
				// int overlap = 0;
				// for(int i = 0; i < a.length; ++i){
				// if(a[i] == 2){
				// ++overlap;
				// }
				// }

				output.printf("Case #%d: %d\n", t, sol[C][W]);
			}
		}

		output.close();
	}
}
