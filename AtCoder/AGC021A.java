/* Filename: AGC021A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC021A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String N = input.next();
			int digitSumN = N.charAt(0) - '0';
			
			for(int i = 1; i < N.length(); ++i){
				if(N.charAt(i) == '9'){
					digitSumN += 9;
				} else {
					break;
				}
			}
			
			int maxDigitSum = Math.max(digitSumN, N.charAt(0) - '0' - 1 + (N.length() - 1) * 9);
			
			System.out.println(maxDigitSum);
		}
	}
}