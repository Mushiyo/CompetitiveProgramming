/* Filename: CodeFestival2016Final_A.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class CodeFestival2016Final_A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int H = input.nextInt();
			int W = input.nextInt();
			
			int row = 0;
			int col = 0;
			for(int i  = 0; i < H; ++i){
				for(int j = 0; j < W; ++j){
					String cell = input.next();
					
					if(cell.equals("snuke")){
						row = i + 1;
						col = j;
					}
				}
			}
			
			System.out.println(String.format("%c%d", col + 'A', row));
		}
	}

}
