// WA
/* Filename: Q2015_15.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2015_15 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(
				"cooking_the_books.txt"));
		PrintWriter out = new PrintWriter(new File(
				"cooking_the_books.out"));

		while (input.hasNext()) {
			int N = input.nextInt();

			for (int caseNum = 1; caseNum <= N; ++caseNum) {
				String num = input.next();

				out.printf("Case #%d: %s %s\n", caseNum, smallest(num),
						largest(num));
			}
		}
		
		out.close();
		input.close();
	}

	private static String smallest(String num) {
		char[] smallest = num.toCharArray();

		int minIndex = -1;
		char minDigit = smallest[0];
		for (int i = 1; i < smallest.length; ++i) {
			if (smallest[i] < minDigit && smallest[i] > '0') {
				minIndex = i;
				minDigit = smallest[i];
			}
		}

		if (minIndex > 0) {
			char tmp = smallest[0];
			smallest[0] = smallest[minIndex];
			smallest[minIndex] = tmp;
		}

		return new String(smallest);
	}

	private static String largest(String num) {
		char[] largest = num.toCharArray();

		int maxIndex = -1;
		char maxDigit = largest[0];
		for (int i = 1; i < largest.length; ++i) {
			if (largest[i] > maxDigit) {
				maxIndex = i;
				maxDigit = largest[i];
			}
		}

		if (maxIndex > 0) {
			char tmp = largest[0];
			largest[0] = largest[maxIndex];
			largest[maxIndex] = tmp;
		}

		return new String(largest);
	}
}
