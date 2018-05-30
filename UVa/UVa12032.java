/* Filename: UVa12032.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12032 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			for(int t = 1; t <= T; ++t){
				int n = input.nextInt();
				int[] r = new int[n];

				r[0] = input.nextInt();
				int lowerBound = r[0];
				for(int i = 1; i < r.length; ++i){
					r[i] = input.nextInt();
					lowerBound = Math.max(lowerBound, r[i] - r[i - 1]);
				}
				
				--lowerBound;
				int upperBound = r[r.length - 1];
				
				// binary search (lowerBound, upperBound]
				while(upperBound - lowerBound > 1){
					int mid = (upperBound + lowerBound) / 2;
					
					if(isTopReachable(mid, r)){
						upperBound = mid;
					} else {
						lowerBound = mid;
					}
				}

				System.out.printf("Case %d: %d\n", t, upperBound);
			}
		}
	}

	private static boolean isTopReachable(int k, int[] r){
		if(k < r[0]){
			return false;
		} else if(k == r[0]){
			--k;
		}
		
		for(int i = 1; i < r.length; ++i){
			if(k < r[i] - r[i - 1]){
				return false;
			} else if(r[i] - r[i - 1] == k){
				--k;
			}
		}
		
		return true;
	}
}
