/* Filename: UVa355.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa355 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int originalBase = input.nextInt();
			int convertBase = input.nextInt();
			String originalVal = input.next();
			
			try{
				String convertVal = Long.toString(Long.valueOf(originalVal, originalBase), convertBase).toUpperCase();
				
				System.out.printf("%s base %d = %s base %d\n", originalVal, originalBase, convertVal, convertBase);
			}
			catch(Exception e){
				System.out.printf("%s is an illegal base %d number\n", originalVal, originalBase);
			}
		}
	}

}
