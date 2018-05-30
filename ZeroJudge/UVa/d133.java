/* Filename: d133.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d133 {
	public static void main(String[] args) {
		final int[] denominations = {0, 1, 5, 10, 25, 50};
		long[][] ways = new long[denominations.length][30000 + 1];
		ways[0][0] = 1;
		for(int denomination = 0; denomination < ways.length; ++denomination){
			ways[denomination][0] = 1;
		}
		
		for(int denomination = 1; denomination < ways.length; ++denomination){
			for(int value = 1; value < ways[denomination].length; ++value){
				ways[denomination][value] = ways[denomination - 1][value];
				
				if(value - denominations[denomination] >= 0){
					ways[denomination][value] += ways[denomination][value - denominations[denomination]];
				}
			}
		}
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			if(ways[ways.length - 1][n] == 1){
				System.out.printf("There is only 1 way to produce %d cents change.\n", n);
			} else {
				System.out.printf("There are %d ways to produce %d cents change.\n", ways[ways.length - 1][n], n);
			}
		}
	}
}
