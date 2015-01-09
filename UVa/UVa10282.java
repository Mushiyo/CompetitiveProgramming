/* Filename: UVa10282.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class UVa10282 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder(); 
		Map<String, String> dict = new HashMap<String, String>();

		while (input.hasNext()) {
			String entry = input.nextLine();
			
			if(entry.isEmpty()){
				break;
			}
			
			int spaceIndex = entry.indexOf(" ");
			String en = entry.substring(0, spaceIndex);
			String foreign = entry.substring(spaceIndex + 1);
			
			dict.put(foreign, en);
		}
		
		while(input.hasNext()){
			String word = input.next();
			
			if(dict.containsKey(word)){
				out.append(dict.get(word));
			} else{
				out.append("eh");
			}
			out.append('\n');
		}
		
		System.out.print(out);
	}

}
