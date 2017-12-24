/* Filename: UVa11456.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11456 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int caseNum = input.nextInt();
			
			while(caseNum-- > 0){
				int n = input.nextInt();
				int[] car = new int[n];
				
				for(int i = 0; i < n; ++i){
					car[i] = input.nextInt();
				}			
				
				// finding the # of cars that can add after car[i]
				int[] revLDSDP = new int[n];
				for(int i = revLDSDP.length - 1; i >= 0; --i){
					revLDSDP[i] = 1;
					
					for(int j = revLDSDP.length - 1; j > i; --j){
						if(car[j] < car[i]){
							revLDSDP[i] = Math.max(revLDSDP[i], revLDSDP[j] + 1);
						}
					}
				}
				
				// finding the # of cars that can add before car[i]
				int[] revLISDP = new int[n];
				for(int i = revLISDP.length - 1; i >= 0; --i){
					revLISDP[i] = 1;
					
					for(int j = revLISDP.length - 1; j > i; --j){
						if(car[j] > car[i]){
							revLISDP[i] = Math.max(revLISDP[i], revLISDP[j] + 1);
						}
					}
				}
				
				int maxLen = 0;
				for(int i = 0; i < revLDSDP.length; ++i){
					maxLen = Math.max(maxLen, revLDSDP[i] + revLISDP[i] - 1);
				}
				
				System.out.println(maxLen);
			}
		}
	}

}
