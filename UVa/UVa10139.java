// TLE

/* Filename: UVa10139.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10139 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int m = input.nextInt();
			int factorizeM = m;
			
			for(int i = n; i > 0 && factorizeM != 1; --i){
				factorizeM /= gcd(i, factorizeM);
			}
			
			if(factorizeM == 1){
				System.out.printf("%d divides %d!\n", m, n);
			}
			else{
				System.out.printf("%d does not divide %d!\n", m, n);
			}
		}
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
