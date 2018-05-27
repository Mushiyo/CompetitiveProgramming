/* Filename: UVa11264.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11264 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			while(T-- > 0){
				int n = input.nextInt();
				int[] C = new int[n];
				
				for(int i = 0; i < C.length; ++i){
					C[i] = input.nextInt();
				}
				
				int last2 = C[0];
				int last1 = C[1];
				int coinType = 2;
				for(int i = 2; i < C.length; ++i){
					if(C[i] > last2 + last1){
						++coinType;
						last2 = last1;
						last1 = C[i];
					}
				}
				
				System.out.println(coinType);
			}
		}
	}

}
