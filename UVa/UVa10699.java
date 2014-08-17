/* Filename: UVa10699.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10699 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int num = input.nextInt();
			
			if(num == 0){
				break;
			}
			
			System.out.printf("%d : %d\n", num, countPrimeFactor(num));
		}
	}
	
	public static int countPrimeFactor(int num){
		int primeFactorNum = 0;
		
		if(num % 2 == 0){
			++primeFactorNum;
			
			while(num % 2 == 0){
				num /= 2;
			}
		}
		
		for(int i = 3; num != 1; i += 2){
			if(num % i == 0){
				++primeFactorNum;
				while(num % i == 0){
					num /= i;
				}
			}
		}
		
		return primeFactorNum;
	}

}
