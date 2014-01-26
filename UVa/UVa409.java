/* Filename: UVa409.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UVa409 {

	public static void main(String[] args) {
		int setNum = 1;
		Set<String> keyword = new HashSet<String>();
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			
			int K = input.nextInt();
			int E = input.nextInt();
			input.nextLine(); // eat change line
						
			keyword.clear();
			for(int i = 0; i < K; ++i){
				keyword.add(input.nextLine());
			}
						
			String[] excuse = new String[E];
			for(int i = 0; i < E; ++i){
				excuse[i] = input.nextLine();
			}
			
			int maxKeyword = 0;
			int[] countKeyword = new int[E];
			for(int i = 0; i < E; ++i){
				String[] excuseWords = excuse[i].toLowerCase().split("\\W+");
								
				for(int j = 0; j < excuseWords.length; ++j){
					if(keyword.contains(excuseWords[j])){
						++countKeyword[i];
					}
				}
				
				maxKeyword = Math.max(maxKeyword, countKeyword[i]);
			}
						
			System.out.printf("Excuse Set #%d\n", setNum);
			for(int i = 0; i < E; ++i){
				if(countKeyword[i] == maxKeyword){
					System.out.println(excuse[i]);
				}
			}
			System.out.println();
			
			++setNum;
		}
	}

}
