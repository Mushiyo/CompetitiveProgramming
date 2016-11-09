// WA
/* Filename: Codeforces711B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Codeforces711B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int[][] a = new int[n][n];

			int i = -1, j = -1;
			for (int row = 0; row < a.length; ++row) {
				for (int col = 0; col < a[row].length; ++col) {
					a[row][col] = input.nextInt();

					if (a[row][col] == 0) {
						i = row;
						j = col;
					}
				}
			}
			
			long sum = 0;
			int r = (i + 1) % n;
			for (int col = 0; col < n; ++col) {
				sum += a[r][col];
			}

			long diffSumRow = sum;
			for (int col = 0; col < a[i].length; ++col) {
				diffSumRow -= a[i][col];
			}

			long diffSumCol = sum;
			for (int row = 0; row < n; ++row) {
				diffSumCol -= a[row][j];
			}

			long diffSumMain = sum;
			for (int row = 0; row < n; ++row) {
				diffSumMain -= a[row][row];
			}

			long diffSumSec = sum;
			for (int row = 0; row < n; ++row) {
				diffSumSec -= a[row][n - row - 1];
			}
			
			

			boolean notExist = false;
			if (diffSumRow != diffSumCol || diffSumRow <= 0 || diffSumCol < 0) {
				notExist = true;
			} else if (n % 2 == 1 && i == j && j == n - i - 1) {
				if (diffSumMain <= 0 || diffSumSec <= 0 || diffSumMain != diffSumSec
						|| diffSumMain != diffSumRow
						|| diffSumMain != diffSumCol) {
					notExist = true;
				}
			} else if (i == j) { // on the Main
				if (diffSumMain <= 0 || diffSumMain != diffSumRow
						|| diffSumMain != diffSumCol) {
					notExist = true;
				}
			} else if (j == n - i - 1) { // on the Secondary
				if (diffSumSec <= 0 || diffSumSec != diffSumRow
						|| diffSumSec != diffSumCol) {
					notExist = true;
				}
			}

			if(n == 1){
				System.out.println(1);
			}
			else if (notExist) {
				System.out.println(-1);
			} else {
				System.out.println(diffSumRow);
			}
		}
	}
}
