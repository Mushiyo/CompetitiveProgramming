/* Filename: UVa10219.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10219 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			System.out.println(combinationDigit(n, k));
		}
	}
	
	public static int combinationDigit(int n, int m) {
		double c = 0;

		for (int i = Math.max(m, n - m) + 1, j = 1; i <= n; ++i, ++j) {
			c += Math.log10(i) - Math.log10(j);
		}

		return (int)Math.floor(c) + 1;
	}

}
