/* Filename: d114.java
 * Author: Mushiyo
 */
package BASIC;

import java.math.BigInteger;

public class d114 {

	public static void main(String[] args) {
		BigInteger ans = BigInteger.valueOf(1);
		
		for(int i = 1; i <= 100; ++i){
			ans = ans.multiply(BigInteger.valueOf(i).pow(101 - i));
		}
		
		String ansStr = ans.toString();
		for(int i = 0; i < ansStr.length(); ++i){
			System.out.println(ansStr.charAt(i));
		}
	}

}
