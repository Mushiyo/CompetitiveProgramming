/* Filename: Timus1263.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1263 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();
			int[] candidate = new int[N + 1];
			
			for(int i = 0; i < M; ++i){
				++candidate[input.nextInt()];
			}
			
			for(int i = 1; i < candidate.length; ++i){
				System.out.printf("%.2f%%\n", (candidate[i] * 100.0) / M);
			}
		}
	}

}
