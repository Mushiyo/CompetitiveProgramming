/* Filename: UVa11805.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11805 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				int N = input.nextInt();
				int K = input.nextInt();
				int P = input.nextInt();
				int lastPalyerNum = ((K - 1) + P) % N + 1;
				
				System.out.printf("Case %d: %d\n", caseNum, lastPalyerNum);
			}
		}
	}

}
