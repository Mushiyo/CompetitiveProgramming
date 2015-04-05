/* Filename: b309.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;

public class b309 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUM_OF_TYPE = 7;
		int[] countType = new int[NUM_OF_TYPE];
		String[] typeName = { "Saber", "Lancer", "Archer", "Rider", "Caster",
				"Assassin", "Berserker" };

		while (input.hasNext()) {
			String line = input.nextLine().toUpperCase();
			
			for(int i = 0; i  < line.length(); ++i){
				if(Character.isLetter(line.charAt(i))){
					++countType[(line.charAt(i) - 'A') % NUM_OF_TYPE];
				}
			}
		}
		
		int max = -1;
		for(int i = 0; i < countType.length; ++i){
			max = Math.max(max, countType[i]);
		}
		
		for(int i = 0; i < countType.length; ++i){
			if(countType[i] == max){
				System.out.println(typeName[i]);
				break;
			}
		}
	}

}
