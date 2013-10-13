//TLE
package BASIC;

import java.math.BigDecimal;
import java.util.Scanner;

public class a248 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigDecimal a = input.nextBigDecimal();
			BigDecimal b = input.nextBigDecimal();
			int N = input.nextInt();
			
			System.out.println(a.divide(b, N, BigDecimal.ROUND_DOWN));
		}
	}

}
