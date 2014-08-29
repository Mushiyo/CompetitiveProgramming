/* Filename: UVa10338.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10338 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int caseNum = input.nextInt();
			
			for(int dataSet = 1; dataSet <= caseNum; ++dataSet){
				String word = input.next();
				int[] count = new int[26];
				
				long ways = 1;
				for(int i = 1; i <= word.length(); ++i){
					++count[word.charAt(i - 1) - 'A'];
					
					ways *= i;
					ways /= count[word.charAt(i - 1) - 'A'];
				}
				
				System.out.printf("Data set %d: %d\n", dataSet, ways);
			}
		}
	}

}
