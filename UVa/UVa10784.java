/* Filename: UVa10784.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10784 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			long N = input.nextLong();
			
			if(N == 0){
				break;
			}
			
			// The number of diagonals of an n-gon is n(n - 3) / 2
			// The problem ask us that given N, find the minimal of n, 
			// which satisfy N <= n(n - 3) / 2
			// Since n must be positive, after solved this equation,
			// we have n = ceiling((3 + sqrt(9 + 8N)) / 2)
			int n = (int)Math.ceil((3 + Math.sqrt(9 + 8 * N)) / 2);
			
			System.out.printf("Case %d: %d\n", caseNum, n);
			++caseNum;
		}
	}

}
