/* Filename: UVa575.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa575 {
	static int MAX_DIGIT = 31;
	static int[] base = new int[MAX_DIGIT];

	public static void main(String[] args) {
		buildBase();
		
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String skewBinary = input.next();
			if(skewBinary.equals("0")){
				break;
			}
			
			System.out.println(skewToDecimal(skewBinary));
		}
	}
	
	public static void buildBase(){
		long twoExp = 2;
		for(int i = 0; i < MAX_DIGIT; ++i){
			base[i] = (int)(twoExp - 1);
			twoExp *= 2;
		}
	}

	public static int skewToDecimal(String skewBinary){
		int decimal = 0;
		for(int i = skewBinary.length() - 1, j = 0; i >= 0; --i, ++j){
			decimal += (skewBinary.charAt(i) - '0') * base[j];
		}
		
		return decimal;
	}
}
