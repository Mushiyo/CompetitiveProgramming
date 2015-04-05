/* Filename: a782.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class a782 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String[] line = input.nextLine().split("\\s+");
			
			if(line[0].equals("END")){
				break;
			}
			
			StringBuilder RASSyndrome = new StringBuilder();
			
			for(int i = 0; i < line.length; ++i){
				RASSyndrome.append(Character.toUpperCase(line[i].charAt(0)));
			}
			RASSyndrome.append(" " + line[line.length - 1]);
			
			System.out.println(RASSyndrome);
		}
	}

}
