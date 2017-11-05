/* Filename: ABC076C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC076C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			char[] SPrime = input.next().toCharArray();
			char[] T = input.next().toCharArray();
			
			boolean hasSol = false;
			for(int i = SPrime.length - T.length; i >= 0; --i){
				
				boolean isMatch = true;
				for(int j = 0; j < T.length; ++j){
					if(SPrime[i + j] != '?'){
						if(SPrime[i + j] != T[j]){
							isMatch = false;
							break;
						}
					}
				}
				
				if(isMatch){
					hasSol = true;
					
					for(int j = 0; j < T.length; ++j){
						SPrime[i + j] = T[j];
					}
					
					break;
				}
			}
			
			if(hasSol){
				for(int i = 0; i < SPrime.length; ++i){
					if(SPrime[i] == '?'){
						SPrime[i] = 'a';
					}
				}
				
				System.out.println(SPrime);
			} else {
				System.out.println("UNRESTORABLE");
			}
		}
	}

}
