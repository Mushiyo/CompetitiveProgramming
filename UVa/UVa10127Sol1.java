/* Filename: UVa10127Sol1.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10127Sol1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			int digit = 1;
			int currentMod = 1;
			final int tenModN = 10 % n;
			int power = 1;
			while(currentMod % n != 0){
				power *= tenModN;
				power %= n;
				currentMod += power;
				currentMod %= n;
				++digit;
			}
			
			System.out.println(digit);
		}
	}

}
