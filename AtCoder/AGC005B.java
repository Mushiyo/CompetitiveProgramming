// TLE

/* Filename: AGC005B.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class AGC005B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] a = new int[N];

			for (int i = 0; i < a.length; ++i) {
				a[i] = input.nextInt();
			}
			
			int[] currentMin = new int[N];
			currentMin[0] = a[0];
			for (int i = 1; i < currentMin.length; ++i){
				currentMin[i] = Math.min(currentMin[i - 1], a[i]);
			}
			
			long rowSum = 0;
			for (int i = 0; i < currentMin.length; ++i){
				rowSum += currentMin[0];
			}
			
			long sum = rowSum;
			int len = N - 1;
			while(len > 0){
				rowSum -= currentMin[N - len - 1];
				
				if(currentMin[N - len] < a[N - len]){
					
				}
				
				sum += rowSum;
			}
			
			System.out.println(sum);
		}
	}

}
