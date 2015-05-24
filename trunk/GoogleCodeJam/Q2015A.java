/* Filename: Q2015A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2015A {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(new File("A-large.in"));
		PrintWriter out = new PrintWriter(new File("pA.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

	        for(int caseNum = 1; caseNum <= T; ++caseNum){
	            int sMax = input.nextInt();
	            String shyness = input.next();

	            int inputviteNum = 0;
	            int standAudience = 0;
	            for(int i = 0; i < shyness.length(); ++i){
	                standAudience += shyness.charAt(i) - '0';

	                if(standAudience <= i){
	                    inputviteNum += i - standAudience + 1;
	                    standAudience = i + 1;
	                }
	            }

	            out.printf("Case #%d: %d\n", caseNum, inputviteNum);
	        }
		}
		
		input.close();
		out.close();
	}

}
