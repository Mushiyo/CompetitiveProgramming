//TLE
/* Filename: ARC060C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ARC060C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt(), A = input.nextInt();
			int[] x = new int[N];
			
			for(int i = 0; i < x.length; ++i){
				x[i] = input.nextInt();
			}
			
			System.out.println(recursiveCount(x, A, 0, 0, 0, 0));
		}
	}
	
	private static long recursiveCount(int[] x, int A, int pos, long currentSum, int pickedNum, long known){
		if(pos == x.length){
			if(currentSum / (double)pickedNum == A){
				return ++known;
			} else {
				return known;
			}
		}else{
			known = recursiveCount(x, A, pos + 1, currentSum, pickedNum, known);
			currentSum += x[pos];
			++pickedNum;
			known = recursiveCount(x, A, pos + 1, currentSum, pickedNum, known);
			return known;
		}
	}
}
