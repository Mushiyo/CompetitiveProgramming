/* Filename: UVa568.java
 * Author: Mushiyo
 */

import java.math.BigInteger;
import java.util.Scanner;

public class UVa568 {
	static final int maxN = 10000 + 1;
	static BigInteger[] factorials = new BigInteger[maxN];
	
	public static void countFactorials(){
		factorials[0] = BigInteger.valueOf(1);
		
		for(int i = 1; i < factorials.length; ++i){
			factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i));
		}
	}
	
	public static char lastNonZeroDigit(BigInteger num){
		String numStr = num.toString();
		
		for(int i = numStr.length() - 1; i >= 0; --i){
			if(numStr.charAt(i) != '0'){
				return numStr.charAt(i);
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		countFactorials();
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int num = input.nextInt();
			
			System.out.printf("%5d -> %c\n", num, lastNonZeroDigit(factorials[num]));
		}
	}
	
}
