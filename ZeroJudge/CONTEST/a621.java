/* Filename: a621.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a621 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int maxN = 20 + 1;
		int[] power2 = new int[maxN];
		
		for(int i = 0, twoN = 1; i < power2.length; ++i, twoN <<= 1){
			power2[i] = twoN;
		}

		while (input.hasNext()) {
			int N = input.nextInt();
			
			for(int i = 0; i <= N; ++i){
				System.out.println("2^" + i + " = " + power2[i]);
			}
		}
	}

}
