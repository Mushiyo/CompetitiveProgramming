// WA
/* Filename: Timus1881.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Timus1881 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int h = input.nextInt();
			int w = input.nextInt();
			int n = input.nextInt();
			int pageUsed = 0;
			int lineUsed = 0;
			int symbolsInALine = 0;
			
			while(n > 0){
				String word = input.next();
				
				if(symbolsInALine + word.length() >= w){
					++lineUsed;
					symbolsInALine = 0;
				}
				
				symbolsInALine += word.length();
				++symbolsInALine; //count the space
				
				--n;
			}
			
			pageUsed = (int) Math.ceil(lineUsed / (double) h);
			
			System.out.println(pageUsed);
		}
	}

}
