/* Filename: b299.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class b299 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			while(T > 0){
				int N = input.nextInt();
				int M = input.nextInt();
				boolean canArrive = true;
				
				for(int i = 0; i < M; ++i){
					int w = input.nextInt();
					
					if(w < N){
						canArrive = false;
					}
				}
				
				if(canArrive){
					System.out.println("YEEES!!! INKER!");
				} else {
					System.out.println("NOOOO!!! JACKY XX!");
				}
				
				--T;
			}
		}
	}

}
