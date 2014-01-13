/* Filename: UVa10478.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10487 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		final int MAX_N = 1000;
		int[] number = new int[MAX_N];

		while (input.hasNext()) {
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(int i = 0; i < n; ++i){
				number[i] = input.nextInt();
			}
			
			System.out.printf("Case %d:\n", caseNum);
			int m = input.nextInt();
			while(m > 0){
				int query = input.nextInt();
				int closestSum = number[0] + number[1];
				
				for(int i = 0; i < n; ++i){
					for(int j = i + 1; j < n; ++j){
						int currentSum = number[i] + number[j];
						
						if(Math.abs(query - currentSum) < Math.abs(query - closestSum)){
							closestSum = currentSum;
						}
					}
				}
				
				System.out.printf("Closest sum to %d is %d.\n", query, closestSum);
				
				--m;
			}
			
			
			++caseNum;
		}
	}

}
