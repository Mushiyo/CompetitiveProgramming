/* Filename: UVa927.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa927 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int C = input.nextInt();
			
			while (C > 0) {
				int i = input.nextInt();
				int[] c = new int[i + 1];

				for (int j = 0; j < c.length; ++j) {
					c[j] = input.nextInt();
				}

				int d = input.nextInt();
				int k = input.nextInt();
				int n = 0;
				int term = 0;

				while (term < k) {
					++n;
					term += d * n;
				}

				long bm = 0;
				long n_j = 1;
				for (int j = 0; j < c.length; ++j) {
					bm += c[j] * n_j;
					n_j *= n;					
				}

				System.out.println(bm);
				
				--C;
			}
		}
	}

}
