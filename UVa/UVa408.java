/* Filename: UVa408.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa408 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int STEP = input.nextInt();
			int MOD = input.nextInt();
			
			if(gcd(STEP, MOD) != 1){
				System.out.printf("%10d%10d    Bad Choice\n\n", STEP, MOD);
			}
			else{
				System.out.printf("%10d%10d    Good Choice\n\n", STEP, MOD);
			}
		}
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
