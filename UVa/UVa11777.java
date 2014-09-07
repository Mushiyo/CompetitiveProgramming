/* Filename: UVa11777.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa11777 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			for(int caseNum = 1; caseNum <= T; ++caseNum){
				int term1 = input.nextInt();
				int term2 = input.nextInt();
				int finalExam = input.nextInt();
				int attendance = input.nextInt();
				int test1 = input.nextInt();
				int test2 = input.nextInt();
				int test3 = input.nextInt();
				int minTest = Math.min(test3, Math.min(test1, test2));
				double classTest = (test1 + test2 +test3 - minTest) / 2.0;
				double score = term1 + term2 + finalExam + attendance + classTest; 
				char grade;
				
				if(score >= 90){
					grade = 'A';
				}else if (score >= 80){
					grade = 'B';
				}else if(score >= 70){
					grade = 'C';
				}else if(score >= 60){
					grade = 'D';
				}else{
					grade = 'F';
				}
				
				
				System.out.printf("Case %d: %c\n", caseNum, grade);
			}
		}
	}

}
