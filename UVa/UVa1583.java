/* Filename: UVa1583.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1583 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] generate = new int[1000000];
		
		for(int i = 1; i <= 1000000; ++i){
			int generateByI = digitSum(i);
			
			if(generateByI < 1000000){
				if(generate[generateByI] == 0){
					generate[generateByI] = i;
				}
			}
		}

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				int N = input.nextInt();
				
				System.out.println(generate[N]);
				
				--T;
			}
		}
	}

	static int digitSum(int n){
		int sum = n;
		
		while(n > 0){
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	}
}
