/* Filename: UVa13012.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa13012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int CONSTESTANT_NUM = 5;

		while (input.hasNext()) {
			int T = input.nextInt();
			int countCorrect = 0;
			
			for(int i = 0; i < CONSTESTANT_NUM; ++i){
				int ans = input.nextInt();
				
				if(ans == T){
					++countCorrect;
				}
			}
			
			System.out.println(countCorrect);
		}
	}

}
