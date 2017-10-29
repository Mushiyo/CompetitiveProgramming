/* Filename: ARC083C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ARC083C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input.nextInt();
			int D = input.nextInt();
			int E = input.nextInt();
			int F = input.nextInt();
			int maxA = F / (A * 100);
			int maxB = F / (B * 100);
			int maxC = F / C;
			int maxD = F / D;
			
			int sugarWater = 100;
			int sugar = 0;
			double maxDensity = 0;
			for(int a = 0; a <= maxA; ++a){
				for(int b = 0; b <= maxB; ++b){
					for(int c = 0; c <= maxC; ++c){
						for(int d = 0; d <= maxD; ++d){
							int currentWater = (a * A + b * B) * 100;
							int currentSugar = c * C + d * D;
							
							if( currentWater + currentSugar <= F){
								if(currentWater / 100 * E >= currentSugar){
									double currentDensity = currentSugar == 0 ? 0 : currentSugar / (double) (currentSugar + currentWater);
									
									if(currentDensity >= maxDensity){
										sugar = currentSugar;
										sugarWater = sugar + currentWater;
										maxDensity = currentDensity;
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(sugarWater + " " + sugar);
		}
	}

}
