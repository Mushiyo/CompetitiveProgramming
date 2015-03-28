/*
ID: mushiyo1
LANG: JAVA
TASK: skidesign
 */

// WA

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class skidesign {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("skidesign.in"));
		PrintWriter output = new PrintWriter("skidesign.out");

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] hillHeight = new int[N];
			
			for(int i = 0; i < hillHeight.length; ++i){
				hillHeight[i] = input.nextInt();
			}
			
			Arrays.sort(hillHeight);
			
			int cost = 0;
			
			for(int i = 0, j = hillHeight.length - 1; i < j; ++i, --j){
				int diff = hillHeight[j]- hillHeight[i];
				
				if(diff > 17){
					int exceedDiff = diff - 17;
					int heightChange = exceedDiff / 2;
					
					if(exceedDiff % 2 == 0){
						cost += 2 * heightChange * heightChange;
					} else{
						cost += heightChange * heightChange + (heightChange + 1) * (heightChange + 1);
					}
				}
			}
			
			output.println(cost);
		}
		
		output.close();
		input.close();
	}

}
