/* Filename: AGC006B.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class AGC006B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int x = input.nextInt();
			int rowNLen = 2 * N - 1;

			if (x == 1 || x == rowNLen) {
				System.out.println("No");
			} else {
				int[] ans = new int[rowNLen + 1];
				for (int i = 0; i < ans.length; ++i) {
					ans[i] = i;
				}

				int mid = N;
				int tmp = ans[mid];
				ans[mid] = x;
				ans[x] = tmp;
				//System.out.println(Arrays.toString(ans));

				tmp = ans[mid - 1];
				ans[mid - 1] = rowNLen;
				ans[rowNLen] = tmp;
				//System.out.println(Arrays.toString(ans));

				if (ans[mid + 1] != 1) {
					tmp = ans[mid + 1];
					ans[mid + 1] = 1;
					ans[1] = tmp;
				}
				//System.out.println(Arrays.toString(ans));
				System.out.println("Yes");
				StringBuilder ansOut = new StringBuilder();
				for (int i = 1; i < ans.length; ++i) {
					ansOut.append(String.format("%d\n", ans[i]));
				}
				System.out.print(ansOut);
			}
		}
	}
}
