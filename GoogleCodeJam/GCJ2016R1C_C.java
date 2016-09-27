/* Filename: GCJ2016R1C_C.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GCJ2016R1C_C {
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner input = new Scanner(System.in);
		 PrintWriter out = new PrintWriter(System.out);
//		 Scanner input = new Scanner(new File("C-small-attempt0.in"));
//		 PrintWriter out = new PrintWriter(new File("pC.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				out.printf("Case #%d: ", t);
			}
		}

		out.close();
		input.close();
	}
}
