/* Filename: a667.java
 * Author: Mushiyo
 */

package BASIC;

import java.util.Scanner;
import java.math.BigInteger;

public class a667 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger dividend = input.nextBigInteger();
			BigInteger divisor  = input.nextBigInteger();
			
			System.out.println(dividend.divide(divisor) + "    " + dividend.mod(divisor));
		}
	}

}
