/* Filename: UVa10019.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				String M = input.next();
				int b1 = Integer.bitCount(Integer.parseInt(M));
				int b2 = Integer.bitCount(Integer.parseInt(M, 16));
				
				System.out.printf("%d %d\n", b1, b2);
				
				--N;
			}
		}
	}

}
