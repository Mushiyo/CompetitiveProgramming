/* Filename: UVa12502.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			while (T > 0) {
				int x = input.nextInt();
				int y = input.nextInt();
				int z = input.nextInt();			
				
				int paidA = (2 * x - y) * z / (x + y) ;
				
				System.out.println(paidA);
				
				--T;
			}
		}
	}

}
