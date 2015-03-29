//TLE

/* Filename: d475.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;

public class d475 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int line = 1;

		while (input.hasNext()) {
			int a = input.nextInt();
			int n = input.nextInt();

			if (a == 0 && n == 0) {
				output.append(String.format("All Over. Exceeded %d lines!\n", line));
				break;
			} else {
				output.append(String.format("%.0f\n", Math.pow(a, n)));
				++line;
			}
		}
		
		System.out.println(output);
	}

}
