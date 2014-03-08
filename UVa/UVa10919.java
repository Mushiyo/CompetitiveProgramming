/* Filename: UVa10919.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10919 {

	public static void main(String[] args) {
		final int maxK = 100;
		final int maxC = 100;
		final int maxM = 100;
		int[] choosedCourse = new int[maxC];
		int[][] category = new int[maxM][maxC];
		
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int k = input.nextInt();
			
			if(k == 0){
				break;
			}
			
			int m = input.nextInt();
			
			for(int i = 0; i < k; ++i){
				choosedCourse[i] = input.nextInt();
			}
			
			boolean canGraduate = true;
			for(int i = 0; i < m; ++i){
				int c = input.nextInt();
				int r = input.nextInt();
				int choosed = 0;
				
				for(int j = 0; j < c; ++j){
					category[i][j] = input.nextInt();
					
					for(int l = 0; l < k; ++l){
						if(category[i][j] == choosedCourse[l]){
							++choosed;
							break;
						}
					}
				}
				
				if(choosed < r){
					canGraduate = false;
				}
			}
			
			if(canGraduate){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}

}
