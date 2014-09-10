/* Filename: UVa11878.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11878 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctCount = 0;

		while (input.hasNext()) {
			String question = input.nextLine();
			
			if(question.charAt(question.length() - 1) == '?'){
				continue;
			}
			
			boolean isPlusQuestion = question.contains("+");
			
			if(isPlusQuestion){
				int indexOfPlus = question.indexOf("+");
				int indexOfEq = question.indexOf("=");
				int a = Integer.parseInt(question.substring(0, indexOfPlus));
				int b = Integer.parseInt(question.substring(indexOfPlus + 1, indexOfEq));
				int c = Integer.parseInt(question.substring(indexOfEq + 1));
				
				if(a + b == c){
					++correctCount;
				}
			}
			else{
				int indexOfMinus = question.indexOf("-");
				int indexOfEq = question.indexOf("=");
				int a = Integer.parseInt(question.substring(0, indexOfMinus));
				int b = Integer.parseInt(question.substring(indexOfMinus + 1, indexOfEq));
				int c = Integer.parseInt(question.substring(indexOfEq + 1));
				
				if(a - b == c){
					++correctCount;
				}
			}
		}
		
		System.out.println(correctCount);
	}

}
