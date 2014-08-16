/* Filename: UVa10579.java
 * Author: Mushiyo
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class UVa10579 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<BigInteger> fibs = new ArrayList<BigInteger>();
		fibs.add(BigInteger.valueOf(0));
		fibs.add(BigInteger.valueOf(1));
		int fibsSize = 2;
		
		while(true){
			fibs.add(fibs.get(fibsSize - 1).add(fibs.get(fibsSize - 2)));
			++fibsSize;
			if(fibs.get(fibsSize - 1).toString().length() > 1000){
				break;
			}
		}

		while (input.hasNext()) {
			System.out.println(fibs.get(input.nextInt()));
		}
	}

}
