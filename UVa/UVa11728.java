/* Filename: UVa11728.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UVa11728 {

	public static void main(String[] args) {
		int[] sumIsS = new int[1000 + 1];
		Arrays.fill(sumIsS, -1);
		
		for(int i = 1; i < sumIsS.length; ++i){
			int S = sumOfFactor(i);
			if(S <= 1000){
				sumIsS[S] = i;
			}
		}
		
		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			int S = input.nextInt();
			
			if(S == 0){
				break;
			}
			
			System.out.printf("Case %d: %d\n", caseNum, sumIsS[S]);
			
			++caseNum;
		}
	}

	public static int sumOfFactor(int n) {
		int sum = 0;

		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				sum += i;
			}
		}

		return sum;
	}
}
