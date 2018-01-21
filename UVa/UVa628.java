/* Filename: UVa628.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa628 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			String[] dict = new String[n];
			
			for(int i = 0; i < dict.length; ++i){
				dict[i] = input.next();
			}
			
			int m = input.nextInt();
			String[] rule = new String[m];
			
			for(int i = 0; i < rule.length; ++i){
				rule[i] = input.next();
			}
			
			System.out.println("--");
			for(int i = 0; i < rule.length; ++i){
				printPass(0, rule[i].toCharArray(), dict, new int[rule[i].length()]);
			}
		}
	}
	
	private static void printPass(int pos, char[] rule, String[] dict, int[] index){
		if(pos == rule.length){
			StringBuilder pass = new StringBuilder();
			for(int i = 0; i < rule.length; ++i){
				if(rule[i] == '0'){
					pass.append(index[i]);
				} else {
					pass.append(dict[index[i]]);
				}
			}
			
			System.out.println(pass);
		} else {
			if(rule[pos] == '0'){
				for(int i = 0; i <= 9; ++i){
					index[pos] = i;
					printPass(pos + 1, rule, dict, index);
				}
			} else {
				for(int i = 0; i < dict.length; ++i){
					index[pos] = i;
					printPass(pos + 1, rule, dict, index);
				}
			}
		}
	}
}
