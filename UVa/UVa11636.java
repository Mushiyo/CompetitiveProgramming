/* Filename: UVa11636.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11636 {

	public static void main(String[] args) {
		int caseNum = 1;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			if(N < 0){
				break;
			}
						
			System.out.printf("Case %d: %.0f\n", caseNum, Math.ceil(Math.log10(N) / Math.log10(2)));
			
			++caseNum;
		}
	}

}
