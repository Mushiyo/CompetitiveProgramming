/* Filename: UVa787.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa787 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int number = input.nextInt();
			BigInteger currProduct = BigInteger.valueOf(number);
			BigInteger maxProduct = BigInteger.valueOf(number);
			BigInteger maxNegative = BigInteger.valueOf(Integer.MIN_VALUE);
			
			number = input.nextInt();
			while(number != -999999){	
				if(currProduct.compareTo(BigInteger.ZERO) == -1){
					maxNegative = maxNegative.max(currProduct);
				}
				
				currProduct = currProduct.multiply(BigInteger.valueOf(number));
				maxProduct = maxProduct.max(currProduct);
				
				if(currProduct.compareTo(BigInteger.ZERO) == -1){					
					maxProduct = maxProduct.max(currProduct.divide(maxNegative));
				}
				
				number = input.nextInt();
			}
			
			System.out.println(maxProduct);
		}
	}

}
