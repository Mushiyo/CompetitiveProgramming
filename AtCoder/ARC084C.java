/* Filename: ARC084C.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class ARC084C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];
			int[] C = new int[N];
			
			for(int i = 0; i < A.length; ++i){
				A[i] = input.nextInt();
			}
			
			for(int i = 0; i < B.length; ++i){
				B[i] = input.nextInt();
			}
			
			for(int i = 0; i < C.length; ++i){
				C[i] = input.nextInt();
			}
			
			Arrays.sort(A);
			Arrays.sort(B);
			Arrays.sort(C);
			
			long[] CLargerB = new long[N];
			for(int b = 0 , c = 0; b < B.length; ++b){
				while(c < C.length && C[c] <= B[b]){
					++c;
				}
				
				CLargerB[b] = C.length - c;
			}
			
			for(int i = C.length - 1; i > 0; --i){
				CLargerB[i - 1] += CLargerB[i];
			}
			
			long ways = 0;
			for(int a = 0, b = 0; a < A.length; ++a){
				while(b < B.length && B[b] <= A[a]){
					++b;
				}
				
				if(b < B.length){
					ways += CLargerB[b];
				}
			}
			
			System.out.println(ways);
		}
	}

}
