/* Filename: UVa1260.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1260 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				int n = input.nextInt();
				int[] A = new int[n];
				int[] B = new int[n - 1];
				
				A[0] = input.nextInt();
				for(int i = 1; i < A.length; ++i){
					A[i] = input.nextInt();
					
					int countNongreater = 0;
					for(int j = 0; j < i; ++j){
						if(A[j] <= A[i]){
							++countNongreater;
						}
					}
					
					B[i - 1] = countNongreater;
				}
				
				int sumB = 0;
				for(int i = 0; i < B.length; ++i){
					sumB += B[i];
				}
				
				System.out.println(sumB);
				
				--T;
			}
		}
	}

}
