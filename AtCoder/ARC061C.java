/* Filename: ARC061C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ARC061C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String S = input.next();
			
			System.out.println(sum(S, 0, 0, 1));
		}
	}
	
	private static long sum(String S, long currentSum, int prevPlus, int pos){
		if(pos == S.length()){
			return currentSum + Long.parseLong(S.substring(prevPlus, pos));
		}
		
		return sum(S, currentSum + Long.parseLong(S.substring(prevPlus, pos)), pos, pos + 1)
				+ sum(S, currentSum, prevPlus, pos + 1);
	}
}
