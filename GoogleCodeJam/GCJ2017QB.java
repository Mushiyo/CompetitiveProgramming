/* Filename: GCJ2017QB.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJ2017QB {

	public static void main(String[] args) throws FileNotFoundException {
//		 Scanner input = new Scanner(System.in);
//		 PrintWriter out = new PrintWriter(System.out);
		 Scanner input = new Scanner(new File("B-large.in"));
		 PrintWriter out = new PrintWriter(new File("pB.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				char[] N = input.next().toCharArray();
				
				while(isTidy(N) == false){
					int d = 0;
					while(d < N.length - 1){
						if(N[d] > N[d + 1]){
							break;
						} else {
							++d;
						}
					}
					
					N[d] = (char)(N[d] - 1);
					for(int i = d + 1; i < N.length; ++i){
						N[i] = '9';
					}
				}
				
				
				out.printf("Case #%d: %d\n", t, Long.valueOf(String.valueOf(N)));
			}
		}

		out.close();
		input.close();
	}

	private static boolean isTidy(char[] N){
		for(int i = 1; i < N.length; ++i){
			if(N[i] < N[i - 1]){
				return false;
			}
		}
		
		return true;
	}
}
