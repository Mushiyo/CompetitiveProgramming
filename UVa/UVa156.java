/* Filename: UVa156.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class UVa156 {

	public static void main(String[] args) {
		final int MAX_SIZE = 1000;
		String[] dictionary = new String[MAX_SIZE];
		int[][] charCount = new int[MAX_SIZE][26];
		Map<Integer, Integer> freqRecord = new HashMap<Integer, Integer>(); 
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = 0;
			
			while(true){
				String word = input.next();
				
				if(word.equals("#")){
					break;
				}
				
				dictionary[N++] = word;
			}
			
			Arrays.sort(dictionary, 0, N);
			
			freqRecord.clear();
			for(int i = 0; i < N; ++i){
				Arrays.fill(charCount[i], 0);
			}
			
			for(int i = 0; i < N; ++i){
				String lowerWord = dictionary[i].toLowerCase();
				
				for(int j = 0; j < lowerWord.length(); ++j){
					++charCount[i][lowerWord.charAt(j) - 'a'];
				}
				
				if(freqRecord.containsKey(Arrays.hashCode(charCount[i]))){
					int freq = freqRecord.get(Arrays.hashCode(charCount[i]));
					freqRecord.put(Arrays.hashCode(charCount[i]), ++freq);
				}
				else{
					freqRecord.put(Arrays.hashCode(charCount[i]), 1);
				}
			}
			
			for(int i = 0; i < N; ++i){
				if(freqRecord.get(Arrays.hashCode(charCount[i])) == 1){
					System.out.println(dictionary[i]);
				}
			}
		}
	}

}
