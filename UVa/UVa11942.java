/* Filename: UVa11942.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11942 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lumberjacks:");

		while (input.hasNext()) {
			int N = input.nextInt();
			input.nextLine(); // eat change line
			
			while(N > 0){
				String[] beardLenStr = input.nextLine().split(" ");
				int[] beardLen = new int[beardLenStr.length];
				
				for(int i = 0; i < beardLen.length; ++i){
					beardLen[i] = Integer.valueOf(beardLenStr[i]);
				}
				
				boolean isIncreasing = true;
				// check increaseing
				for(int i = 1; i < beardLen.length; ++i){
					if(beardLen[i] < beardLen[i -1]){
						isIncreasing = false;
						break;
					}
				}
				
				// check decreaseing
				boolean isDecreasing = true;
				for(int i = 1; i < beardLen.length; ++i){
					if(beardLen[i] > beardLen[i -1]){
						isDecreasing = false;
						break;
					}
				}
				
				if(isIncreasing || isDecreasing){
					System.out.println("Ordered");
				}
				else{
					System.out.println("Unordered");
				}
				
				--N;
			}
		}
	}

}
