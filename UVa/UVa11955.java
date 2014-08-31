/* Filename: UVa11955.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11955 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter("\\W+");

		while (input.hasNext()) {
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				String a = input.next();
				String b = input.next();
				int k = input.nextInt();
				
				System.out.printf("Case %d: ", caseNum);
				for(int i = k, j = 0; i >= 0; --i, ++j){
					if(i < k){
						System.out.print("+");
					}
					
					long coefficient = combination(k, i);
					
					if(coefficient > 1){
						System.out.print(coefficient + "*");
					}
					
					if(i > 0){
						System.out.print(a);
						if(i > 1){
							System.out.print("^" + i);
						}
					}
					
					if(i > 0 && j > 0){
						System.out.print("*");
					}
					
					if(j > 0){
						System.out.print(b);
						if(j > 1){
							System.out.print("^" + j);
						}
					}
				}
				System.out.println();				
			}
		}
	}

	public static long combination(int n, int m) {
		long c = 1;

		for (int i = Math.max(m, n - m) + 1, j = 1; i <= n; ++i, ++j) {
			c = (c * i) / j;
		}

		return c;
	}
}
