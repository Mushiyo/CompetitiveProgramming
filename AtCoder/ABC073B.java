/* Filename: ABC073B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC073B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int total = 0;
			int N = input.nextInt();
			
			while(N > 0){
				int l = input.nextInt();
				int r = input.nextInt();
				
				total += r - l + 1;
				
				--N;
			}
			
			System.out.println(total);
		}
	}

}
