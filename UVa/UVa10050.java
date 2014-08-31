/* Filename: UVa10050.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10050 {
	final static boolean HARTAL = true;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				--T;
				
				int N = input.nextInt();
				boolean[] day = new boolean[N];
				int P = input.nextInt();
				
				for(int i = 0; i < P; ++i){
					int h = input.nextInt();
					
					for(int j = h - 1; j < day.length; j += h){
						day[j] = HARTAL;
					}
				}
				
				int hartalDay = 0;
				for(int i = 0; i < day.length; ++i){
					if(day[i] == HARTAL && i % 7 != 5 && i % 7 != 6){
						++hartalDay;					
					}
				}
				
				System.out.println(hartalDay);
			}
		}
	}
}
