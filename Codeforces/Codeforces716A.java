/* Filename: Codeforces716A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Codeforces716A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt(), c = input.nextInt();
			
			int wordRemained = 1;
			int prev = input.nextInt();
			for(int i = 1; i < n; ++i){
				int current = input.nextInt();
				
				if(current - prev <= c){
					++wordRemained;
				} else{
					wordRemained = 1;
				}
				
				prev = current;
			}
			
			System.out.println(wordRemained);
		}
	}

}
