/* Filename: d397.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d397 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int[] denomination = {5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
		final int MAX_VAL = 300;
		long[] ways = new long[MAX_VAL * 100 + 1];
		ways[0] = 1;
		
		for(int d = 0; d < denomination.length; ++d){
			for(int val = 1; val < ways.length; ++val){			
				if(val - denomination[d] >= 0){
					ways[val] += ways[val - denomination[d]];
				}
			}
		}
		
		while(input.hasNext()){
			double money = input.nextDouble();
			
			if(money == 0){
				break;
			}
			
			System.out.printf("%6.2f%17d\n", money, ways[(int)(money * 100 + 1e-6)]);
		}
	}
}
