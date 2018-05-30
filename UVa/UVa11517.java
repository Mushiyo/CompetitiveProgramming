/* Filename: UVa11517.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa11517 {
	final static int INF = 1 << 20;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int caseNum = input.nextInt();
			
			while(caseNum-- > 0){
				int price = input.nextInt();
				int n = input.nextInt();
				int[] money = new int[n];
				
				int maxMoney = 0;
				for(int i = 0; i < money.length; ++i){
					money[i] = input.nextInt();
					maxMoney = Math.max(maxMoney, money[i]);
				}
				
				int[] DP = new int[maxMoney + 10000 + 1];
				Arrays.fill(DP, INF);
				DP[0] = 0;
				
				for(int m = 0; m < money.length; ++m){
					for(int p = DP.length - 1; p >= money[m]; --p){
						DP[p] = Math.min(DP[p], DP[p - money[m]] + 1);
					}
				}
				
				int minPaid = price;
				while(DP[minPaid] == INF){
					++minPaid;
				}
				
				System.out.println(minPaid + " " + DP[minPaid]);
			}
		}
	}
}
