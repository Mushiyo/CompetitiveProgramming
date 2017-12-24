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
			BigInteger maxProduct = BigInteger.valueOf(number);
			BigInteger firstNegativeProduct = number < 0 ? BigInteger.valueOf(number) : BigInteger.valueOf(0);
			BigInteger currProduct = BigInteger.valueOf(number);

			number = input.nextInt();
			while (number != -999999) {
				BigInteger bigNumber = BigInteger.valueOf(number);

				if (number != 0) {
					if(currProduct.signum() == 0 && firstNegativeProduct.signum() == 0){ // the first number after reset
						firstNegativeProduct = number < 0 ? BigInteger.valueOf(number) : BigInteger.valueOf(0);
						currProduct = BigInteger.valueOf(number);
					} else if (currProduct.signum() == 0) {
						currProduct = currProduct.add(bigNumber);
					} else {
						currProduct = currProduct.multiply(bigNumber);

						if (currProduct.signum() == -1) {
							if (firstNegativeProduct.signum() == 0) {
								firstNegativeProduct = currProduct;
							} else {
								maxProduct = maxProduct.max(currProduct.divide(firstNegativeProduct));
							}
						}

						maxProduct = maxProduct.max(currProduct);
					}
				} else { // encounter 0, reset
					maxProduct = maxProduct.max(BigInteger.ZERO);
					firstNegativeProduct = BigInteger.valueOf(0);
					currProduct = BigInteger.valueOf(0);
				}
				
				number = input.nextInt();
			}

			System.out.println(maxProduct);
		}
	}

}
