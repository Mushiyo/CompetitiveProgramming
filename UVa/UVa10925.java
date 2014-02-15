/* Filename: UVa10925.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.BigInteger;

public class UVa10925 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int billNum = 1;

		while (input.hasNext()) {
			int N = input.nextInt();
			BigInteger F = input.nextBigInteger();
			
			if(N == 0 && F.equals(BigInteger.ZERO)){
				break;
			}
			
			BigInteger totalCost = BigInteger.valueOf(0);
			
			while(N > 0){
				totalCost = totalCost.add(input.nextBigInteger());
				
				--N;
			}
			
			System.out.printf("Bill #%d costs %d: each friend should pay %d\n", billNum, totalCost, totalCost.divide(F));
			System.out.println();
			
			++billNum;
		}
	}

}
