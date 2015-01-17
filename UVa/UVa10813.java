/* Filename: UVa10813.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa10813 {
	private static final int MARKED = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[][] bingo = new int[5][5];
		bingo[2][2] = MARKED;

		while (input.hasNext()) {
			int n = input.nextInt();

			while (n > 0) {
				for (int i = 0; i < bingo.length; ++i) {
					for (int j = 0; j < bingo[i].length; ++j) {
						if (i == 2 && j == 2) {
							continue;
						} else {
							bingo[i][j] = input.nextInt();
						}
					}
				}

				boolean isBingo = false;
				int bingoTime = 0;
				for (int i = 0; i < 75; ++i) {
					int numCalled = input.nextInt();

					if (isBingo == false) {
						markNum(numCalled, bingo);
						
						if(isBingoed(bingo)){
							isBingo = true;
							bingoTime = i + 1;
						}
					}
				}
				
				System.out.printf("BINGO after %d numbers announced\n", bingoTime);

				--n;
			}
		}
	}

	private static void markNum(int numCalled, int[][] bingo) {
		for (int i = 0; i < bingo.length; ++i) {
			for (int j = 0; j < bingo[i].length; ++j) {
				if (bingo[i][j] == numCalled) {
					bingo[i][j] = MARKED;
					break;
				}
			}
		}
	}

	private static boolean isBingoed(int[][] bingo) {
		for (int i = 0; i < bingo.length; ++i) {
			boolean allMarked = true;
			for (int j = 0; j < bingo.length; ++j) {
				if (bingo[i][j] != MARKED) {
					allMarked = false;
					break;
				}
			}

			if (allMarked) {
				return true;
			}
		}

		for (int j = 0; j < bingo.length; ++j) {
			boolean allMarked = true;
			for (int i = 0; i < bingo.length; ++i) {
				if (bingo[i][j] != MARKED) {
					allMarked = false;
					break;
				}
			}
			
			if (allMarked) {
				return true;
			}
		}
		
		boolean allMarked = true;
		for(int i = 0; i < bingo.length; ++i){
			if(bingo[i][i] != MARKED){
				allMarked = false;
				break;
			}
		}
		
		if(allMarked){
			return true;
		}
		
		allMarked = true;
		for(int i = 0; i < bingo.length; ++i){
			if(bingo[i][bingo.length - i - 1] != MARKED){
				allMarked = false;
				break;
			}
		}
		
		if(allMarked){
			return true;
		}

		return false;
	}
}
