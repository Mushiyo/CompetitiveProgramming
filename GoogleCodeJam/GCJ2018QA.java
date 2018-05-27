/* Filename: GCJ2018QA.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class GCJ2018QA {
	private static final char SHOOT = 'S';
	private static final char CHARGE = 'C';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int D = input.nextInt();
				StringBuilder P = new StringBuilder(input.next());
				boolean isPossible = !isImpossible(D, P);
				int countSwap = 0;
				
				if(isPossible){
					int[] strength = new int[P.length()];
					int currentStrength = 1;
					long totalDamage = 0;
					
					for(int i = 0; i < strength.length; ++i){
						if(P.charAt(i) == CHARGE){
							currentStrength *= 2;
						} else {
							strength[i] = currentStrength;
							totalDamage += currentStrength;
						}
					}
					
					while(totalDamage > D){
						int swapPoint = P.lastIndexOf("CS") + 1;
						
						if(swapPoint < 0){
							isPossible = false;
							break;
						}
						
						totalDamage -= strength[swapPoint] / 2;
						strength[swapPoint - 1] = strength[swapPoint] / 2;
						strength[swapPoint] = 0;
						P.setCharAt(swapPoint - 1, SHOOT);
						P.setCharAt(swapPoint, CHARGE);
						++countSwap;
					}
				}
				
				System.out.printf("Case #%d: ", t);
				if(isPossible){
					System.out.println(countSwap);
				} else {
					System.out.println("IMPOSSIBLE");
				}
			}
		}
	}
	
	private static boolean isImpossible(int D, StringBuilder P){
		int countShoot = 0;
		
		for(int i = 0; i < P.length(); ++i){
			if(P.charAt(i) == SHOOT){
				++countShoot;
			}
		}
		
		if(countShoot > D){
			return true;
		} else {
			return false;
		}
	}

}
