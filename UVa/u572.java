import java.util.Scanner;

public class u572 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();

			if (m == 0 && n == 0) {
				break;
			}

			char[][] field = new char[m][n];
			for (int i = 0; i < field.length; ++i) {
				String tmp = input.next();
				for (int j = 0; j < field[0].length; ++j) {
					field[i][j] = tmp.charAt(j);
				}
			}

			int oilFieldNum = 0;
			for (int i = 0; i < field.length; ++i) {
				for (int j = 0; j < field[0].length; ++j) {
					if (field[i][j] == '@') {
						DFS(field, i, j);
						++oilFieldNum;
					}
				}
			}

			System.out.println(oilFieldNum);
		}
	}

	static void DFS(char[][] field, int i, int j) {
		field[i][j] = '*';

		for (int dx = -1; dx <= 1; ++dx) {
			for (int dy = -1; dy <= 1; ++dy) {
				int nx = i + dx;
				int ny = j + dy;
				if ((nx >= 0 && nx < field.length)
						&& (ny >= 0 && ny < field[0].length)
						&& (field[nx][ny] != '*')) {
					DFS(field, nx, ny);
				}
			}
		}
	}

}
