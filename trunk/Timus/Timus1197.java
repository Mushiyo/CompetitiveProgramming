/* Filename: Timus1197.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1197 {
	static final int[] dx = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static final int[] dy = { 2, 1, -1, -2, -2, -1, 1, 2 };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				String pos = input.next();
				int x = pos.charAt(0) - 'a' + 1;
				int y = pos.charAt(1) - '0';
				
				int countAttackable = 0;
				for(int d = 0; d < dx.length; ++d){
					if(x + dx[d] > 0 && x + dx[d] <= 8 && y + dy[d] > 0 && y + dy[d] <= 8){
						++countAttackable;
					}
				}
				
				System.out.println(countAttackable);
				
				--N;
			}
		}
	}
}
