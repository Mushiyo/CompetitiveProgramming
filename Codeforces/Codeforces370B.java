import java.util.Scanner;
import java.util.Arrays;

public class Codeforces370B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SIZE = 100 + 1;
		int[] countCard = new int[SIZE];
		boolean[] canWin = new boolean[SIZE];
		boolean[][] hasCard = new boolean[SIZE][SIZE];

		int[] simulate;

		while (input.hasNext()) {
			int n = input.nextInt();

			Arrays.fill(countCard, 0, n, 0);
			Arrays.fill(canWin, 0, n, false);
			for (int i = 0; i < n; ++i) {
				Arrays.fill(hasCard[i], false);
			}

			for (int i = 0; i < n; ++i) {
				int m = input.nextInt();
				countCard[i] = m;

				for (int card = 0; card < m; ++card) {
					int cardId = input.nextInt();
					hasCard[i][cardId] = true;
				}
			}

			for (int i = 0; i < n; ++i) {
				simulate = Arrays.copyOf(countCard, n);

				boolean willWin = true;
				for (int j = 0; j < SIZE; ++j) {
					if (hasCard[i][j] == true) {
						--simulate[i];

						for (int k = 0; k < n; ++k) {
							if (k == i) {
								continue;
							}

							if (hasCard[k][j] == true) {
								--simulate[k];
							}

							if (simulate[k] <= 0) {
								willWin = false;
								break;
							}
						}
					}

					if (willWin == false) {
						canWin[i] = false;
						break;
					}

					if (simulate[i] == 0) {
						canWin[i] = true;
						break;
					}
				}
			}

			for (int i = 0; i < n; ++i) {
				if (canWin[i] == true) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}

}
