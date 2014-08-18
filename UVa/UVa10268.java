/* Filename: UVa10268.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10268 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int x = input.nextInt();
			input.nextLine(); // eat '\n'
			String[] a = input.nextLine().split("\\s+");

			int n = a.length;
			
			int derivative = 0;
			int xPow = 1;
			for (int i = a.length - 2; i >= 0; --i, xPow *= x) {
				derivative += Integer.valueOf(a[i]) * (n - i - 1) * xPow;
			}
			
			System.out.println(derivative);
		}
	}
}
