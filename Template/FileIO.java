/* Filename: FileIO.java
 * Author: Mushiyo
 * Description: A file I/O template
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("input.in"));
		PrintWriter out = new PrintWriter(new File("output.out"));
		
		while (input.hasNext()) {
			// write code here
		}
				
		input.close();
		out.close();
	}
}
