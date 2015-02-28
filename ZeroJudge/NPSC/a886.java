/* Filename: a886.java
 * Author: Mushiyo
 */
package NPSC;

import java.util.Scanner;
import java.util.Arrays;

public class a886 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int[] dx = {0, 0, 1, -1};
		final int[] dy = {1, -1, 0, 0};
		final int MAX_SIZE = 50 + 2;
		int[][] lunchBox = new int[MAX_SIZE][MAX_SIZE];
		int[][] diggedBox = new int[MAX_SIZE][MAX_SIZE];

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int M = input.nextInt();
				int N = input.nextInt();
				int K = input.nextInt();
				
				init(lunchBox, M, N);
				init(diggedBox, M, N);

				for (int i = 1; i <= M; ++i) {
					for (int j = 1; j <= N; ++j) {
						lunchBox[i][j] = input.nextInt();
					}
				}
				
				int digArea = 0;
				for (int i = 1; i <= M; ++i) {
					for (int j = 1; j <= N; ++j) {
						diggedBox[i][j] = 0;
						for(int d = 0; d < dx.length; ++d){
							diggedBox[i][j] |= lunchBox[i][j] | lunchBox[i + dx[d]][j + dy[d]];
						}
						
						digArea += diggedBox[i][j];
					}
				}
				
				System.out.println(M * N * K - digArea * 3);

				--T;
			}
		}
	}
	
	private static void init(int[][] a, int M, int N){
		for(int i = 0; i < M + 2; ++i){
			Arrays.fill(a[i], 0, N + 2, 0);
		}
	}

}
