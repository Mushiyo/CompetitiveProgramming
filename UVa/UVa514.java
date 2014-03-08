/* Filename: UVa514.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Stack;

public class UVa514 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			
			if(N == 0){
				break;
			}
			
			while(true){
				int firstCarriage = input.nextInt();
				
				if(firstCarriage == 0){
					break;
				}
				
				int[] targetOrder = new int[N];
				targetOrder[0] = firstCarriage;
				for(int i = 1; i < N; ++i){
					targetOrder[i] = input.nextInt();
				}
				
				int carriageInB = 0;
				Stack<Integer> carriageLeaveA = new Stack<Integer>();
				for(int i = 1; i <= N; ++i){
					carriageLeaveA.push(i);
					
					while(!carriageLeaveA.empty() && targetOrder[carriageInB] == carriageLeaveA.peek()){
						carriageLeaveA.pop();
						++carriageInB;
					}
				}
				
				if(carriageInB == N){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
			
			System.out.println();
		}
	}

}
