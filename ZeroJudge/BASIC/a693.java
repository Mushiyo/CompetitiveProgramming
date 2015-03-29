/* Filename: a693.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;

public class a693 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX_N = 100000 + 1;
		int[] food = new int[MAX_N];

		while (input.hasNext()) {
			int n = input.nextInt();
			int m = input.nextInt();
			
			for(int i = 1; i <= n; ++i){
				food[i] = food[i - 1] + input.nextInt();
			}
			
			while(m > 0){
				int l = input.nextInt();
				int r = input.nextInt();
				
				System.out.println(food[r] - food[l - 1]);
				
				--m;
			}
		}
	}

}
