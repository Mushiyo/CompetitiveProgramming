/* Filename: UVa11984.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11984 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				int C = input.nextInt();
				int d = input.nextInt();
				double originalF = toFahrenheit(C);
				double newC = toCelsius(originalF + d);
				
				System.out.printf("Case %d: %.2f\n", caseNum, newC);
			}
		}
	}
	
	static double toFahrenheit(double C){
		return 9 * C / 5 + 32;
	}
	
	static double toCelsius(double F){
		return (F - 32) * 5 / 9;
	}
}
