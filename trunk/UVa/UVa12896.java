/* Filename: UVa12896.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12896 {
	static final String[] keypad = {" ",".,?\"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				int L = input.nextInt();
				int[] N = new int[L];
				
				for(int i = 0; i < N.length; ++i){
					N[i] = input.nextInt();
				}
				
				int[] P = new int[L];
				for(int i = 0; i < P.length; ++i){
					P[i] = input.nextInt();
				}
				
				StringBuilder message = new StringBuilder();
				
				for(int i = 0; i < L; ++i){
					message.append(keypad[N[i]].charAt((P[i] - 1) % keypad[N[i]].length()));
				}
				
				System.out.println(message);
				
				--T;
			}
		}
	}

}
