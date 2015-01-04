/* Filename: UVa1339.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa1339 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] countPlateChar = new int[26];
		int[] countOriginalChar = new int[26];
		while (input.hasNext()) {
			String plateMessage = input.nextLine();
			String origianlMessage = input.nextLine();
			
			Arrays.fill(countPlateChar, 0);
			Arrays.fill(countOriginalChar, 0);
			
			for(int i = 0; i < plateMessage.length(); ++i){
				++countPlateChar[plateMessage.charAt(i) - 'A'];
				++countOriginalChar[origianlMessage.charAt(i) - 'A'];
			}
			
			Arrays.sort(countPlateChar);
			Arrays.sort(countOriginalChar);
			
			if(Arrays.equals(countPlateChar, countOriginalChar)){
				System.out.println("YES");
			} else{
				System.out.println("NO");
			}
		}
	}

}
