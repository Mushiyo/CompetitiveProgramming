/* Filename: UVa11371.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa11371 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {

			String nStr = String.valueOf(input.nextInt());

			if (isAll0(nStr)) {
				System.out.printf("0 - 0 = 0 = 9 * 0\n");
				continue;
			}

			char[] n = nStr.toCharArray();
			Arrays.sort(n);
			StringBuilder bStr = new StringBuilder(String.copyValueOf(n));
			StringBuilder aStr = new StringBuilder(bStr).reverse();

			int firstNon0Index = 0;
			while (firstNon0Index < bStr.length() - 1
					&& bStr.charAt(firstNon0Index) == '0') {
				++firstNon0Index;
			}

			char tmp = bStr.charAt(firstNon0Index);
			bStr.setCharAt(firstNon0Index, '0');
			bStr.setCharAt(0, tmp);

			long a = Long.valueOf(aStr.toString());
			long b = Long.valueOf(bStr.toString());
			long aMinusB = a - b;
			long k = aMinusB / 9;

			System.out.printf("%d - %d = %d = 9 * %d\n", a, b, aMinusB, k);
		}
	}

	static boolean isAll0(String n) {
		for (int i = 0; i < n.length(); ++i) {
			if (n.charAt(i) != '0') {
				return false;
			}
		}

		return true;
	}

}
