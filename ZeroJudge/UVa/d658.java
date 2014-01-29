/* Filename: d658.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d658 {

	public static void main(String[] args) {
		int caseNum = 1;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();

			if (N < 0) {
				break;
			}

			System.out.printf("Case %d: %.0f\n", caseNum,
					Math.ceil(Math.log10(N) / Math.log10(2)));

			++caseNum;
		}
	}

}
