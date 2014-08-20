//WA
/* Filename: UVa10212.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10212 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();
			
			System.out.println(lastNon0InP(N, M));
		}
	}
	
	public static long lastNon0InP(int n, int m) {
		if(m == 0){
			return 1;
		}
		
		if(n == 0 && m != 0){
			return 0;
		}
		
		long p = 1;

		for (int i = n - m + 1; i <= n; ++i) {
			p *= i;
			while(p % 10 == 0){
				p /= 10;
			}
			p %= 10;
		}

		return p;
	}
}
