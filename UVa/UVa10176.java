/* Filename: UVa10176.java
 * Author: Mushiyo
 */

import java.math.BigInteger;
import java.util.Scanner;

public class UVa10176 {

	public static void main(String[] args) {
		BigInteger mod = BigInteger.valueOf(131071);
		Scanner input = new Scanner(System.in);
		StringBuilder inputStr = new StringBuilder();

		while (input.hasNext()) {
			inputStr.append(input.next());
		}
		
		String[] binNum = inputStr.toString().split("\\D+");
		for(int i = 0; i < binNum.length; ++i){
			BigInteger number = new BigInteger(binNum[i], 2);

			if (number.mod(mod).equals(BigInteger.ZERO)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
