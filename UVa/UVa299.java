/* Filename: UVa299.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa299 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				int L = input.nextInt();
				int[] carriage = new int[L];
				
				for(int i = 0; i < carriage.length; ++i){
					carriage[i] = input.nextInt();
				}
				
				int swap = 0;
				for(int i = 0; i < carriage.length; ++i){
					for(int j = i + 1; j < carriage.length; ++j){
						if(carriage[i] > carriage[j]){
							++swap;
						}
					}
				}
				
				System.out.printf("Optimal train swapping takes %d swaps.\n", swap);
				
				--N;
			}
		}
	}

}
