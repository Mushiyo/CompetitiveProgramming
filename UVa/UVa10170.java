/* Filename: UVa10170.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10170 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long S = input.nextLong();
			long D = input.nextLong();
			
			long d = 0;
			while(d < D){
				d += S;
				++S;
			}
			
			System.out.println(S - 1);
		}
	}

}
