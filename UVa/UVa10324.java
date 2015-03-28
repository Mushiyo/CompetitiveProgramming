/* Filename: UVa10324.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class UVa10324 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			String str01 = input.next();
			ArrayList<Integer> diffIndex = new ArrayList<Integer>();

			for (int i = 1; i < str01.length(); ++i) {
				if (str01.charAt(i) != str01.charAt(i - 1)) {
					diffIndex.add(2 * i - 1);
				}
			}

			int n = input.nextInt();
			System.out.printf("Case %d:\n", caseNum++);
			for (int N = 0; N < n; ++N) {
				int i = input.nextInt();
				int j = input.nextInt();
				int left = Math.min(i, j);
				int right = Math.max(i, j);
				int getLeft = Collections.binarySearch(diffIndex, 2 * left);
				int getRight = Collections.binarySearch(diffIndex, 2 * right);

				if (left >= str01.length() || right >= str01.length()) {
					System.out.println("No");
				} else {
					if (getLeft != getRight) {
						System.out.println("No");
					} else {
						System.out.println("Yes");
					}
				}
			}
		}
	}

}
