/* Filename: UVa1584.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1584 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			input.nextLine(); // eat change line
			
			while(T > 0){
				String DNA = input.nextLine();
				int DNALen = DNA.length();
				String minSeq = DNA;
				
				DNA += DNA;
				
				for(int i = 0; i < DNALen; ++i){
					String currSeq = DNA.substring(i, i + DNALen);
					
					if(currSeq.compareTo(minSeq) < 0){
						minSeq = currSeq;
					}
				}
				
				System.out.println(minSeq);
				
				--T;
			}
		}
	}

}
