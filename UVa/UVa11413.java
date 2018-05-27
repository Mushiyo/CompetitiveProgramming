/* Filename: UVa11413.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11413 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			int[] c = new int[n];
			int lowerBound = 0;
			int upperBound = 0;
			
			for(int i = 0; i < c.length; ++i){
				c[i] = input.nextInt();
				lowerBound = Math.max(lowerBound, c[i]) - 1;
				upperBound += c[i]; 
			}
			
			while(upperBound - lowerBound > 1){
				int mid = (upperBound + lowerBound) / 2;
				
				if(isAllFilled(c, m, mid)){
					upperBound = mid;
				} else {
					lowerBound = mid;
				}
			}
			
			System.out.println(upperBound);
		}
	}

	private static boolean isAllFilled(int[] vessel, int m, int containerSize){
		int remain = containerSize;
		int used = 1;
		
		for(int i = 0; i < vessel.length; ++i){
			if(remain < vessel[i]){
				remain = containerSize;
				++used;
			}
			
			remain -= vessel[i];
						
			if(remain < 0 || used > m){
				return false;
			}
		}
		
		return true;
	}
}
