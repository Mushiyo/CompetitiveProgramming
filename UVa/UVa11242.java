/* Filename: UVa11142.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa11242 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int f = input.nextInt();
			if(f == 0){
				break;
			}
			
			int r = input.nextInt();
			
			int[] frontTeeth = new int[f];
			for(int i = 0; i < frontTeeth.length; ++i){
				frontTeeth[i] = input.nextInt();
			}
			
			int[] rearTeeth = new int[r];
			for(int i = 0; i < rearTeeth.length; ++i){
				rearTeeth[i] = input.nextInt();
			}
			
			double[] driveRatio = new double[f * r];
			for(int i = 0; i < frontTeeth.length; ++i){
				for(int j = 0; j < rearTeeth.length; ++j){					
					driveRatio[i * r + j] = (double) rearTeeth[j] / frontTeeth[i];
 				}
			}
			
			Arrays.sort(driveRatio);
			
			double maxSpread = Double.MIN_VALUE;
			for(int i = 1; i < driveRatio.length; ++i){
				double currSpread = driveRatio[i] / driveRatio[i - 1];
				
				maxSpread = Math.max(currSpread, maxSpread);
			}
			
			System.out.printf("%.2f\n", maxSpread);
		}
	}

}
