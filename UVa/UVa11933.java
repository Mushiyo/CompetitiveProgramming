
/* Filename: UVa11933.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11933 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			int a = 0;
			int b = 0;
			int shift = 0;
			boolean isOddPos = true;
			
			while (n > 0){
				int currentBit = n & 1;
				
				if (currentBit == 1){
					if(isOddPos){
						a |= (1 << shift);
					} else {
						b |= (1 << shift);
					}
					
					isOddPos = !isOddPos;
				}
				
				n >>= 1;
				++shift;
			}
			
			System.out.println(a + " " + b);
		}
	}

}
