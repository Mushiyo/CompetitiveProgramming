/* Filename: UVa11057.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa11057 {

	public static void main(String[] args) {
		final int MAX_N = 10000;
		int[] bookPrice = new int[MAX_N];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			for(int i = 0; i < N; ++i){
				bookPrice[i] = input.nextInt();
			}
			
			Arrays.sort(bookPrice, 0, N);
			
			int M = input.nextInt();
			int i = 0, j = 0;
			int minDiff = Integer.MAX_VALUE;
			for(int iPos = 0; iPos < N; ++iPos){
				int findPrice = M - bookPrice[iPos];
				int diff = Math.abs(findPrice - bookPrice[iPos]);
				if(diff > minDiff){
					break;
				}
				
				int jPos = Arrays.binarySearch(bookPrice, 0, N, findPrice);
				
				if(jPos >= 0 && diff < minDiff){
					i = Math.min(bookPrice[iPos], findPrice);
					j = Math.max(bookPrice[iPos], findPrice);
					minDiff = diff;
				}
			}
			
			System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", i, j);
		}
	}

}
