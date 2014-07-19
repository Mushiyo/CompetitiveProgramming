/* Filename: a780.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a780 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			double f0 = input.nextDouble();
			double fe = input.nextDouble();
			double FA = input.nextDouble();
			
			if(f0 == 0 && fe == 0 && FA == 0){
				break;
			}
			
			double M = f0 / fe;
			double FT = FA / M;
			
			System.out.printf("%.2f %.2f\n", M, FT);
		}
	}

}
