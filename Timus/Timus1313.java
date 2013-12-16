import java.util.Scanner;

public class Timus1313 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[][] imageUsual = new int[N][N];

			for (int row = 0; row < imageUsual.length; ++row) {
				for (int col = 0; col < imageUsual[0].length; ++col) {
					imageUsual[row][col] = input.nextInt();
				}
			}

			for (int i = 0; i <= 2 * (N - 1); ++i) {
				for (int j = 0; j <= i; ++j) {
					if ((i - j) < imageUsual.length && j < imageUsual[0].length) {
						System.out.print(imageUsual[i - j][j] + " ");
					}
				}
			}
			
			System.out.println();
		}
	}

}
