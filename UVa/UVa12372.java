/* Filename: UVa12372.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12372 {

	public static void main(String[] args) {
		final int DIMENSION = 3;
		final int MAX_SIZE = 20;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				boolean isGood = true;
				
				for(int i = 0; i < DIMENSION; ++i){
					if(input.nextInt() > MAX_SIZE){
						isGood = false;
					}
				}
				
				if(isGood){
					System.out.printf("Case %d: good\n", caseNum);
				}
				else{
					System.out.printf("Case %d: bad\n", caseNum);
				}				
			}

		}
	}

}
