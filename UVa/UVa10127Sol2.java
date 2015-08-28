/* Filename: UVa10127Sol2.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10127Sol2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			int digit = 1;
			int currentMod = 1;
			final int tenModN = 10 % n;
			while(currentMod % n != 0){
				currentMod *= tenModN;
				++currentMod;
				currentMod %= n;
				++digit;
			}
			
			System.out.println(digit);
		}
	}

}
