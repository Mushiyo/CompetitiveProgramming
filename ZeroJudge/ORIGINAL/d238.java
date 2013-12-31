/* Filename: d238.java
 * Author: Mushiyo
 */
package ORIGINAL;

import java.util.Scanner;
import java.math.BigInteger;

public class d238 {

	public static void main(String[] args) {
		String twoPow1000 = BigInteger.valueOf(2).pow(1000).toString();
		 
		int digitSum = 0;
		for(int i = 0; i < twoPow1000.length(); ++i){
			digitSum += twoPow1000.charAt(i) - '0';
		}
		
		System.out.println(digitSum);
	}

}
