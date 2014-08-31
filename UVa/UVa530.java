/* Filename: UVa530.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa530 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			System.out.println(combination(n, k));
		}
	}

	public static long combination(int n, int m) {
		long c = 1;

		for (int i = Math.max(m, n - m) + 1, j = 1; i <= n; ++i, ++j) {
			c = (c * i) / j;
		}

		return c;
	}
}
