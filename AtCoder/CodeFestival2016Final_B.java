// WA

/* Filename: CodeFestival2016Final_B.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Stack;

public class CodeFestival2016Final_B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
				int N = input.nextInt();
				Stack<Integer> sol = new Stack<Integer>();
				
				while(N >= 1){
					int half1 = N / 2 + N % 2;
					int half2 = N / 2;
					
					if(half1 == half2){
						++half1;
						--half2;
					}
					
					sol.add(half1);
					N = half2;
				}
				
				while(sol.empty() == false){
					System.out.println(sol.pop());
				}
		}
	}

}
