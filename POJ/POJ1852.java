/* Filename: POJ1852.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class POJ1852 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int caseNum = input.nextInt();
			
			while(caseNum > 0){
				int poleLen = input.nextInt();
				int n = input.nextInt();
				int[] antPos = new int[n];
				
				for(int i = 0; i < antPos.length; ++i){
					antPos[i] = input.nextInt();
				}
				
				int minTime = -1;
				int maxTime = -1;
				for(int i = 0; i < antPos.length; ++i){
					minTime = Math.max(minTime, Math.min(antPos[i], poleLen - antPos[i]));
					maxTime = Math.max(maxTime, Math.max(antPos[i], poleLen - antPos[i]));
				}
				
				System.out.printf("%d %d\n", minTime, maxTime);
				
				--caseNum;
			}
			
		}
	}

}
