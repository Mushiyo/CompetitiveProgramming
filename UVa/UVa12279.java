/* Filename: UVa12279.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12279 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			int N = input.nextInt();
			
			if(N == 0){
				break;
			}
			
			int treatCount = 0;
			
			for(int i = 0; i < N; ++i){
				int event = input.nextInt();
				
				if(event == 0){
					++treatCount;
				}
			}
			
			int emoogleBalance = (N - treatCount) - treatCount;
			System.out.printf("Case %d: %d\n", caseNum, emoogleBalance);
			
			++caseNum;
		}
	}

}
