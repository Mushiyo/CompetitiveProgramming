/* Filename: UVa11565.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11565 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			while(N > 0){
				int A = input.nextInt();
				int B = input.nextInt();
				int C = input.nextInt();
				int postiveSqrtC = (int) Math.sqrt(C);
				int x = -10001;
				int y = -10001;
				int z = -10001;
				boolean hasSolution = false;
				
				for(x = -postiveSqrtC;x <= postiveSqrtC; ++x){
					for(y = x + 1;x * x + y * y <= C; ++y){
						z = A - x - y;
						
						if(x * y * z == B && x * x + y * y + z * z == C && x != z && y != z){
							hasSolution = true;
							break;
						}
					}
					
					if(hasSolution){
						break;
					}
				}
				
				if(hasSolution){
					System.out.printf("%d %d %d\n", x, y, z);
				} else {
					System.out.println("No solution.");
				}
				
				--N;
			}
		}
	}

}
