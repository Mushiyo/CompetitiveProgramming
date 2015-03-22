/* Filename: Timus1110.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.math.*;

public class Timus1110 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			BigInteger N = input.nextBigInteger();
			int M = input.nextInt();
			BigInteger bigM = BigInteger.valueOf(M);
			BigInteger Y = input.nextBigInteger();
			
			boolean hasSolution = false;
			for(int x = 0; x < M; ++x){
				if(BigInteger.valueOf(x).modPow(N, bigM).equals(Y)){
					if(hasSolution){
						System.out.printf(" %d", x);
					} else {
						hasSolution = true;
						System.out.print(x);
					}					
				}
			}
			
			if(hasSolution){
				System.out.println();
			} else {
				System.out.println("-1");
			}
		}
	}

}
