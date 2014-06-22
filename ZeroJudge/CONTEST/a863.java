/* Filename: a863.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class a863 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 

		while (input.hasNext()) {
			int n = input.nextInt();
			int squareSum = n;
			Set<Integer> appearedNum = new HashSet<Integer>();
			
			while(!appearedNum.contains(squareSum) && squareSum != 1){
				appearedNum.add(squareSum);
				squareSum = countSquareSum(squareSum);
			}
			
			if(squareSum == 1){
				System.out.println(n + " is a happy number");
			}
			else{
				System.out.println(n + " is an unhappy number");
			}
		}
	}

	public static int countSquareSum(int n){
		int sum = 0;
		
		while(n != 0){
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		
		return sum;
	}
}
