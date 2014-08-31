// TLE

/* Filename: UVa11344.java
 * Author: Mushiyo
 */

import java.math.BigInteger;
import java.util.Scanner;

public class UVa11344 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		BigInteger[] fullSet = new BigInteger[12 + 1];
		
		for(int i = 0; i < fullSet.length; ++i){
			fullSet[i] = BigInteger.valueOf(i);
		}

		while (input.hasNext()) {
			int N = input.nextInt();
			
			while(N > 0){
				String M = input.nextLine();
				int setLen = input.nextInt();
				int[] set = new int[setLen];
				
				for(int i = 0; i < set.length; ++i){
					set[i] = input.nextInt();
				}
				
				boolean isWonderful = true;
				for(int i = 0; i < set.length && isWonderful; ++i){
					switch(set[i]){
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					}
				}
				
				if(isWonderful){
					out.append(M + " - Wonderful.\n");
				}
				else{
					out.append(M + " - Simple.\n");
				}
				
				--N;
			}
		}
		
		System.out.println(out);
	}

}
