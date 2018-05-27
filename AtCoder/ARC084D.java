/* Filename: ARC084D.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ARC084D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int K = input.nextInt();
			
			while(K % 2 == 0 && K > 2){
				K /= 2;
			}
			
			while(K % 5 == 0 && K > 5){
				K /= 5;
			}
			
			int minDigitSum = Integer.MAX_VALUE;
			for(int i = 1; i <= 9; ++i){
				int multipleK = K * i;
				System.err.println(digitSum(multipleK));
				minDigitSum = Math.min(minDigitSum, digitSum(multipleK));
			}
			
			System.out.println(minDigitSum);
		}
	}

	private static int digitSum(int num){
		int sum = 0;
		
		while(num > 0){
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
}
