/* Filename: UVa10295.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class UVa10295 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int m = input.nextInt();
			int n = input.nextInt();
			Map<String, Integer> HayPointDict = new HashMap<String, Integer>();
			
			while(m > 0){
				HayPointDict.put(input.next(), input.nextInt());
				
				--m;
			}
			
			while(n > 0){
				String word = input.next();
				long salary = 0;
				
				while(word.equals(".") == false){
					if(HayPointDict.containsKey(word)){
						salary += HayPointDict.get(word);
					}
					word = input.next();
				}
				System.out.println(salary);
				
				--n;
			}
		}
	}

}
