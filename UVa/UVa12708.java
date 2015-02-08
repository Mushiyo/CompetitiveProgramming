/* Filename: UVa12708.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12708 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				long N = input.nextLong();
				
				if(N % 2 != 0){
					--N;
				}
				
				System.out.println(N / 2);
				
				--T;
			}
		}
	}

}
