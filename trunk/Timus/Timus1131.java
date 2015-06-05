/* Filename: Timus1131.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1131 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int K = input.nextInt();
			long copiedComputer = 1;
			int time = 0;
			
			while(copiedComputer < N && copiedComputer < K){
				copiedComputer <<= 1;
				++time;
			}
			
			N -= copiedComputer;
			if(N > 0){
				time += N / K;
				
				if(N % K > 0){
					++time;
				}
			}
			
			System.out.println(time);
		}
	}

}
