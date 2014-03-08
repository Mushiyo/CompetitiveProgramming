/* Filename: UVa324.java
 * Author: Mushiyo
 */

import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class UVa324 {
	static final int maxN = 366 + 1;
	static BigInteger[] factorials = new BigInteger[maxN];
	
	public static void countFactorials(){
		factorials[0] = BigInteger.valueOf(1);
		
		for(int i = 1; i < factorials.length; ++i){
			factorials[i] = factorials[i - 1].multiply(BigInteger.valueOf(i));
		}
	}

	public static void main(String[] args) {
		countFactorials();
		int[] countDigit = new int[10]; 
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int num = input.nextInt();
			
			if(num == 0){
				break;
			}
			
			Arrays.fill(countDigit, 0);
			String numStr = factorials[num].toString();
			for(int i = 0; i < numStr.length(); ++i){
				++countDigit[numStr.charAt(i) - '0'];
			}
			
			System.out.printf("%d! --\n", num);
			for(int i = 0; i < 5; ++i){
				if(i > 0){
					System.out.printf(" ");
				}
				System.out.printf("   (%d)%5d", i, countDigit[i]);
			}
			System.out.println();
			for(int i = 5; i < countDigit.length; ++i){
				if(i > 5){
					System.out.printf(" ");
				}
				System.out.printf("   (%d)%5d", i, countDigit[i]);
			}
			System.out.println();
		}
	}

}
