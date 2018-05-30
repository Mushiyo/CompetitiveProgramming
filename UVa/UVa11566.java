/* Filename: UVa11566.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11566 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int x = input.nextInt();
			int T = input.nextInt();
			int K = input.nextInt();

			if (N == 0 && x == 0 && T == 0 && K == 0) {
				break;
			}

			int[] price = new int[K + 1];
			int[] favour = new int[K + 1];
			for (int i = 1; i < price.length; ++i) {
				price[i] = input.nextInt();

				for (int j = 0; j < N + 1; ++j) {
					favour[i] += input.nextInt();
				}
			}

			int budget = (int) ((N + 1) * (x / 1.1 - T + 1e-6));
			int[][][]DP = new int[K + 1][budget + 1][2 * (N + 1) + 1];
			for(int k = 1; k < DP.length; ++k){
				for(int p = 1; p < DP[k].length; ++p){
					for(int picked = 0; picked < DP[k][p].length; ++picked){
						DP[k][p][picked] = DP[k - 1][p][picked];
						
						if(p - price[k] >= 0 && picked - 1 >= 0){
							DP[k][p][picked] = Math.max(DP[k][p][picked], DP[k - 1][p - price[k]][picked - 1] + favour[k]);
						}
						
						if(p - 2 * price[k] >= 0 && picked - 2 >= 0){
							DP[k][p][picked] = Math.max(DP[k][p][picked], DP[k - 1][p - 2 * price[k]][picked - 2] + 2 * favour[k]);
						}
					}
				}
			}
			
			System.out.printf("%.2f\n", DP[K][budget][2 * (N + 1)] / (double) (N + 1));
		}
	}
}
