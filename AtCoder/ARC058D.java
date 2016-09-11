// TLE
/* Filename: ARC058D.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class ARC058D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt(), W = input.nextInt();
			int A = input.nextInt(), B = input.nextInt();
			
			int[] part1 = new int[W];
			int[] tmp1 = new int[W];
			
			Arrays.fill(part1, 1);
			
			int H_A = H-A;
			for(int i = 1; i < H_A; ++i){				
				countWays(part1, tmp1);
				System.arraycopy(tmp1, 0, part1, 0, part1.length);
			}
			
			int[] part2 = new int[W - B];
			int[] tmp2 = new int[part2.length];
			System.arraycopy(part1, B, part2, 0, part2.length);
			for(int i = 0; i < A; ++i){
				countWays(part2, tmp2);
				System.arraycopy(tmp2, 0, part2, 0, part2.length);
			}
			
			System.out.println(part2[part2.length - 1]);
		}
	}

	private static void countWays(int[] previous, int[] current){
		current[0] = previous[0];
		
		for(int i = 1; i < current.length; ++i){
			current[i] = (current[i - 1] + previous[i]) % 1000000007;
		}
	}
}
