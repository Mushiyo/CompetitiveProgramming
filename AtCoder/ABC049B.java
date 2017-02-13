/* Filename: ABC049B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC049B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt();
			int W = input.nextInt();
			String[] C = new String[H];
			
			for(int i = 0; i < H; ++i){
				C[i] = input.next();
				
				System.out.println(C[i]);
				System.out.println(C[i]);
			}
		}
	}

}
