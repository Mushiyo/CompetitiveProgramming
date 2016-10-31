/* Filename: ABC046B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC046B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int K = input.nextInt();
			
			int ways = K;
			for(int i = 2; i <= N; ++i){
				ways *= (K - 1);
			}
			
			System.out.println(ways);
		}
	}

}
