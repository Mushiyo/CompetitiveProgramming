/* Filename: Timus1225.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1225 {

	public static void main(String[] args) {
		long[] sol = new long[45 + 1];
		sol[1] = 2;
		sol[2] = 2;
		
		for(int i = 3; i < sol.length; ++i){
			sol[i] = sol[i - 1] + sol[i - 2];
		}
		
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			System.out.println(sol[N]);
		}
	}

}
