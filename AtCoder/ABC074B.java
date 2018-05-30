/* Filename: ABC074B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC074B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while(input.hasNext()){
			int N = input.nextInt();
			int K = input.nextInt();
			
			int distSum = 0;
			for(int i = 0; i < N; ++i){
				int x = input.nextInt();
				
				int min = Math.min(x, K - x);
				distSum += min * 2;
			}
			
			System.out.println(distSum);
		}
	}

}
