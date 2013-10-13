package BASIC;

import java.util.Scanner;

public class a038 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			StringBuilder num = new StringBuilder(input.next());
			num = deleteLeadingZero(num).reverse(); //將字串去掉開頭的0後反轉 
			num = deleteLeadingZero(num);//將反轉後的字串去掉開頭的0

			System.out.println(num);
		}
	}
	
	public static StringBuilder deleteLeadingZero(StringBuilder num){
		int startIndex = countLeadingZero(num);
		
		return new StringBuilder(num.substring(startIndex));
		
	}

	public static int countLeadingZero(StringBuilder num) {
		int leadingZero = 0;
		for (int i = 0; i < num.length(); ++i) {
			if (num.charAt(i) != '0') {
				break;
			} else {
				++leadingZero;
			}
		}

		return leadingZero;
	}

}
