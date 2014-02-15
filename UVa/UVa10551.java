/* Filename: UVa10551.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10551 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int b = input.nextInt();
			
			if(b == 0){
				break;
			}
			
			BigInteger p = new BigInteger(input.next(), b);
			BigInteger m = new BigInteger(input.next(), b);
			
			System.out.println(p.mod(m).toString(b));
		}
	}

}
