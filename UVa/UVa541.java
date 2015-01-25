/* Filename: UVa541.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa541 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX_N = 100;
		int[][] matrix = new int[MAX_N][MAX_N];

		while (input.hasNext()) {
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] rowBit = new int[n + 1];
			int[] colBit = new int[n + 1];

			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					matrix[i][j] = input.nextInt();

					if (matrix[i][j] == 1) {
						++rowBit[i];
					}
				}
			}

			for (int j = 1; j <= n; ++j) {
				for (int i = 1; i <= n; ++i) {
					if (matrix[i][j] == 1) {
						++colBit[j];
					}
				}
			}

			boolean isCorrupted = false;
			boolean isOK = true;
			int oddCount = 0;
			int oddRow = 0;
			for (int i = 1; i < rowBit.length; ++i) {
				if (rowBit[i] % 2 == 1) {
					++oddCount;
					oddRow = i;
				}
			}

			isCorrupted = oddCount > 1;
			isOK = oddCount == 0;

			oddCount = 0;
			int oddCol = 0;
			for (int i = 1; i < colBit.length; ++i) {
				if (colBit[i] % 2 == 1) {
					++oddCount;
					oddCol = i;
				}
			}

			isCorrupted = isCorrupted || oddCount > 1;
			isOK = isOK && oddCount == 0;

			if (isOK) {
				System.out.println("OK");
			} else if (isCorrupted){
				System.out.println("Corrupt");
			} else {
				System.out.printf("Change bit (%d,%d)\n", oddRow, oddCol);
			}
		}
	}

}
