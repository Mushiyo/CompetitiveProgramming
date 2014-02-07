/* Filename: UVa11078.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11078 {

	public static void main(String[] args) {
		final int MAX_N = 100000;
		int[] score = new int[MAX_N];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				int n = input.nextInt();
				
				for(int i = 0; i < n; ++i){
					score[i] = input.nextInt();
				}
				
				int maxSenior = score[0];
				int maxDiff = Integer.MIN_VALUE;
				
				for(int i = 1; i < n; ++i){
					maxDiff = Math.max(maxDiff, maxSenior - score[i]);
					maxSenior = Math.max(maxSenior, score[i]);
				}
				
				System.out.println(maxDiff);
				
				--T;
			}
		}
	}

}
