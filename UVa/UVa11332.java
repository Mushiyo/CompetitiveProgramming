/* Filename: UVa11332.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11332 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			while(n / 10 > 0){
				int sumDigit = 0;
				
				while(n > 0){
					sumDigit += n % 10;
					n /= 10;
				}
				
				n = sumDigit;
			}
			
			System.out.println(n);
		}
	}

}
