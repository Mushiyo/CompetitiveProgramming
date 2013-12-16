import java.util.Scanner;

public class Timus1319 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int label = 1;
			int N = input.nextInt();
			int[][] reverseTable = new int[N][N];

			for (int i = 0; i <= 2 * (N - 1); ++i) {
				for (int j = 0; j <= i; ++j) {
					if ((i - j) < reverseTable.length && j < reverseTable[0].length) {
						reverseTable[j][i - j] = label;
						++label;
					}
				}
			}

			for (int row = 0; row < reverseTable.length; ++row) {
				for (int col = reverseTable[0].length - 1; col >= 0; --col) {
					System.out.print(reverseTable[row][col] + " ");
				}
				System.out.println();
			}

		}
	}

}
