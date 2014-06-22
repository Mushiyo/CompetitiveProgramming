/* Filename: a759.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a759 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int B = input.nextInt();
			int D = input.nextInt();
			int[] S = new int[D];
				
			int maxS = 0;
			for(int i = 0; i < D; ++i){
				int N = input.nextInt();
				int A = Integer.valueOf(input.next(), N);
				if(A >= B){
					S[i] = 0;
					continue;
				}
				
				int C = A + B;
				S[i] = Integer.bitCount(C);
				maxS = Math.max(maxS, S[i]);
			}
			
			int countWinner = 0;
			for(int i = 0; i < D; ++i){
				if(S[i] == maxS){
					++countWinner;
				}
			}
			
			System.out.println(maxS + " " + countWinner);
		}
	}

}
