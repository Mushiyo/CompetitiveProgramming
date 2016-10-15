/* Filename: CodeFestival2016QA_C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class CodeFestival2016QA_C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			char[] s = input.next().toCharArray();
			int K = input.nextInt();

			int cur = 0;
			boolean hasA = false;
			while (K > 0) {
				if (cur < s.length - 1) {
					int distToA = ('z' - s[cur] + 1) % 26;

					if (distToA <= K) {
						s[cur] = 'a';
						K -= distToA;
					}

				} else {
					char tmp = (char) ((s[cur] - 'a' + K % 26) % 26 + 'a');
					
					if(tmp > s[cur] && hasA && K % 26 == 0){
						
					} else {
						s[cur] = tmp;
					}
					
					K = 0;
				}
				
				if (s[cur] == 'a') {
					hasA = true;
				}				
				++cur;
			}

			System.out.println(s);
		}
	}

}
