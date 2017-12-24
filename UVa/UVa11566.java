/* Filename: UVa11566.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11566 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int x = input.nextInt();
			int T = input.nextInt();
			int K = input.nextInt();
			
			if(N == 0 && x == 0 && T == 0 && K == 0){
				break;
			}
			
			int[] price = new int[K + 1];
			int[] favour = new int[K + 1];
			for(int i = 1; i < price.length; ++i){
				price[i] = input.nextInt();
				
				for(int j = 0; j < N + 1; ++j){
					favour[i] += input.nextInt();
				}
			}
			
			int budget = (int)((N + 1) * (x / 1.1 - T));
			int[][] DP = new int[K + 1][budget + 1];
			int[][] platePicked = new int[K + 1][budget + 1]; 
			for(int k = 1; k < DP.length; ++k){
				for(int money = 1; money < DP[k].length; ++money){
					DP[k][money] = DP[k - 1][money];
					platePicked[k][money] = platePicked[k - 1][money];
					int picked = 0;
					
					if(money - price[k] >= 0 && DP[k - 1][money - price[k]] + favour[k] > DP[k][money]){
						if(platePicked[k - 1][money - price[k]] + 1 <= 2 * (N + 1)){
							DP[k][money] = DP[k - 1][money - price[k]] + favour[k];
							picked = 1;
						}
					}
					
					if(money - 2 * price[k] >= 0 && DP[k - 1][money - 2 * price[k]] + 2 * favour[k] > DP[k][money]){
						if(platePicked[k - 1][money - 2 * price[k]] + 2 <= 2 * (N + 1)){
							DP[k][money] = DP[k - 1][money - 2 * price[k]] + 2 * favour[k];
							picked = 2;
						}
					}
					
					platePicked[k][money] += picked;
				}
			}
			//System.err.println(budget);
			//System.err.println(DP[K][budget] + " " + (N + 1));
			System.out.printf("%.2f\n", DP[K][budget] / (double)(N + 1));
		}
	}

}
