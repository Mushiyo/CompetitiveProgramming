/* Filename: UVa11085.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class UVa11085 {

	public static void main(String[] args) {
		ArrayList<int[]> eightQueenSol = new ArrayList<int[]>();
		eightQueen(0, new int[8], eightQueenSol);

		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			int[] rowOfCol = new int[8];

			for (int i = 0; i < rowOfCol.length; ++i) {
				rowOfCol[i] = input.nextInt();
			}

			int minMove = Integer.MAX_VALUE;
			for(int i = 0; i < eightQueenSol.size(); ++i){
				int[] sol = eightQueenSol.get(i);
				int currentMove = 0;
				
				for(int col = 0; col < sol.length; ++col){
					if(sol[col] != rowOfCol[col]){
						++currentMove;
					}
				}
				
				minMove = Math.min(minMove, currentMove);
			}

			System.out.printf("Case %d: %d\n", caseNum++, minMove);
		}
	}

	private static void eightQueen(int col, int[] rowOfCol, ArrayList<int[]> sol) {
		if (col == 8) {
			if (isCollision(rowOfCol) == false) {
				sol.add(Arrays.copyOf(rowOfCol, rowOfCol.length));
			}
		} else {
			for (int row = 1; row <= 8; ++row) {
				rowOfCol[col] = row;
				int move = rowOfCol[col] == row ? 0 : 1;
				eightQueen(col + 1, rowOfCol, sol);
			}

		}
	}

	private static boolean isCollision(int[] rowOfCol) {
		for (int i = 0; i < rowOfCol.length; ++i) {
			int currentRow = rowOfCol[i];

			for (int j = 0; j < rowOfCol.length; ++j) {
				if (i != j) {
					// check horizontal collision
					if (rowOfCol[j] == currentRow) {
						return true;
					}

					// check diagonal collision
					if (Math.abs(rowOfCol[j] - currentRow) == Math.abs(j - i)) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
