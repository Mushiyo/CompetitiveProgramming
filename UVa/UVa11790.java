/* Filename: UVa11790.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11790 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int T = input.nextInt();
			
			for(int t = 1; t <= T; ++t){
				int N = input.nextInt();
				int[] height = new int[N];
				int[] width = new int[N];
				
				for(int i = 0; i < height.length; ++i){
					height[i] = input.nextInt();
				}
				
				for(int i = 0; i < width.length; ++i){
					width[i] = input.nextInt();
				}
				
				int[] LISDP = new int[N];
				int[] LDSDP = new int[N];
				for(int i = 0; i < LISDP.length; ++i){
					LISDP[i] = width[i];
					LDSDP[i] = width[i];
					
					for(int j = 0; j < i; ++j){
						if(height[j] < height[i]){
							LISDP[i] = Math.max(LISDP[i], LISDP[j] + width[i]);
						}
						
						if(height[j] > height[i]){
							LDSDP[i] = Math.max(LDSDP[i], LDSDP[j] + width[i]);
						}
					}
				}
				
				int LISLen = 0;
				int LDSLen = 0;
				for(int i = 0; i < LISDP.length; ++i){
					LISLen = Math.max(LISLen, LISDP[i]);
					LDSLen = Math.max(LDSLen, LDSDP[i]);
				}
				
				System.out.printf("Case %d. ", t);
				if(LISLen >= LDSLen){
					System.out.printf("Increasing (%d). Decreasing (%d).\n", LISLen, LDSLen);
				} else {
					System.out.printf("Decreasing (%d). Increasing (%d).\n", LDSLen, LISLen);
				}
			}
		}
	}

}
