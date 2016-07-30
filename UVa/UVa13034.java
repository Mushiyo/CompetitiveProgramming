/* Filename: UVa13034.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa13034 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int PROB_NUM = 13;

		while (input.hasNext()) {
			int S = input.nextInt();

			for (int setNum = 1; setNum <= S; ++setNum) {
				boolean isAllSolve = true;
				for (int i = 0; i < PROB_NUM; ++i) {
					int predict = input.nextInt();

					if (predict == 0) {
						isAllSolve = false;
					}
				}
				
				System.out.printf("Set #%d: ", setNum);
				if(isAllSolve){
					System.out.println("Yes");
				} else{
					System.out.println("No");
				}
			}
		}
	}

}
