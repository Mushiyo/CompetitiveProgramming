/* Filename: UVa10931.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10931 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int I = input.nextInt();
			
			if(I == 0){
				break;
			}
			
			System.out.printf("The parity of %s is %d (mod 2).\n", Integer.toBinaryString(I), Integer.bitCount(I));
		}
	}

}
