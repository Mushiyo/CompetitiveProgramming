/* Filename: UVa1586.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1586 {

	public static void main(String[] args) {
		final double[] moleMass = {12.01, 1.008, 16.00, 14.01};
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				String formula = input.next();
				int[] count = new int[4];
				
				int prevIndex = 0;
				for(int i = 1; i < formula.length(); ++i){
					if(Character.isLetter(formula.charAt(i))){
						int diff = i - prevIndex;
						
						if(diff == 1){
							++count[getIndex(formula.charAt(prevIndex))];
						} else {
							int quantity = Integer.parseInt(formula.substring(prevIndex + 1, i));
							count[getIndex(formula.charAt(prevIndex))] += quantity;
						}
						
						prevIndex = i;
					}
				}
				
				if(Character.isDigit(formula.charAt(formula.length() - 1))){
					int quantity = Integer.parseInt(formula.substring(prevIndex + 1));
					count[getIndex(formula.charAt(prevIndex))] += quantity;
				} else if (prevIndex == formula.length() - 1){
					++count[getIndex(formula.charAt(prevIndex))];
				}
				
				double formulaMass = 0;
				for(int i = 0; i < moleMass.length; ++i){
					formulaMass += count[i] * moleMass[i];
				}
				
				System.out.printf("%.3f\n", formulaMass);
				
				--T;
			}
		}
	}
	
	private static int getIndex (char element){
		switch(element){
		case 'C':
			return 0;
		case 'H':
			return 1;
		case 'O':
			return 2;
		case 'N':
			return 3;
		}
		
		return -1;
	}

}
