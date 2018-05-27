/* Filename: UVa10264.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10264 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int angleNum = 1 << n;
			int[] weight = new int[angleNum];

			for (int i = 0; i < weight.length; ++i) {
				weight[i] = input.nextInt();
			}

			int[] potency = new int[angleNum];
			for (int i = 0; i < potency.length; ++i) {
				int toggle = 1;

				while (toggle < angleNum) {
					potency[i] += weight[i ^ toggle];
					toggle <<= 1;
				}
			}

			int maxPairPotency = 0;
			for (int i = 0; i < potency.length; ++i) {
				int toggle = 1;

				while (toggle < angleNum) {
					maxPairPotency = Math.max(maxPairPotency, potency[i] + potency[i ^ toggle]);
					toggle <<= 1;
				}
			}
			
			System.out.println(maxPairPotency);
		}
	}

}
