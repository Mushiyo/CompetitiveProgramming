/* Filename: UVa640.java
 * Author: Mushiyo
 */

import java.util.Arrays;

public class UVa640 {
	static int size = 1000000 + 1;
	static boolean[] isSelfNum = new boolean[size];

	public static void findSelfNum() {
		Arrays.fill(isSelfNum, true);

		for (int i = 1; i < isSelfNum.length; ++i) {
			if (isSelfNum[i]) {
				int current = i + digitSum(i);

				while (current < size && isSelfNum[current] != false) {
					isSelfNum[current] = false;
					current += digitSum(current);
				}
			}
		}
	}

	public static int digitSum(int n) {
		int sum = 0;

		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		findSelfNum();
		
		StringBuilder out = new StringBuilder();
		for (int i = 1; i < isSelfNum.length; ++i) {
			if (isSelfNum[i]) {
				out.append(i + "\n");
			}
		}
		
		System.out.print(out);
	}

}
