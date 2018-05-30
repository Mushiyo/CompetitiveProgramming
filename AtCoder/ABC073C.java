/* Filename: ABC073C.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class ABC073C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int[] A = new int[N];
			
			for(int i = 0; i < A.length; ++i){
				A[i] = input.nextInt();
			}
			
			Arrays.sort(A);
			
			int oddNum = 0;
			int l = 0;
			int r = l + 1;
			while(r < A.length){
				while(r < A.length && A[l] == A[r]){
					++r;
				}
				
				oddNum += (r - l) % 2;
				l = r;
			}
			
			System.out.println(oddNum);
		}
	}

}
