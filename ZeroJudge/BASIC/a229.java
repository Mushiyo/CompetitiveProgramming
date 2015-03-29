/* Filename: a229.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;

public class a229 {
	private static StringBuilder output = new StringBuilder();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isFirstOutput = true;

		while (input.hasNext()) {
			int N = input.nextInt();

			if (isFirstOutput) {
				isFirstOutput = false;
			} else {
				System.out.println();
			}

			StringBuilder sol = new StringBuilder();
			findSol(sol, N, N);
		}
		
		System.out.print(output);
	}

	private static void findSol(StringBuilder sol, int left, int right) {
		if (left == 0 && right == 0) {
			output.append(sol + "\n");
			return;
		} else {
			if (left > 0) {
				findSol(sol.append('('), left - 1, right);
				sol.deleteCharAt(sol.length() - 1);
			}

			if (right > left && right > 0) {
				findSol(sol.append(')'), left, right - 1);
				sol.deleteCharAt(sol.length() - 1);
			}
		}
	}
}
