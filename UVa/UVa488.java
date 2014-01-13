/* Filename: UVa488.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa488 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] paritalWave = {"", "1", "22", "333", "4444", "55555", "666666", "7777777", "88888888", "999999999"};
		
		while (input.hasNext()) {
			int n = input.nextInt();

			while (n > 0) {
				int amplitude = input.nextInt();
				int frequency = input.nextInt();
				StringBuilder output = new StringBuilder();

				for(int f = 1; f <= frequency; ++f) {
					for (int i = 1; i <= amplitude; ++i) {
						output.append(paritalWave[i]+"\n");
						
					}
					for (int i = amplitude - 1; i > 0; --i) {
						output.append(paritalWave[i]+"\n");
					}
					
					if(f < frequency){
						output.append("\n");
					}
				}
				
				System.out.print(output);
				if(n != 1){
					System.out.println();
				}
				
				--n;
			}
		}
	}
}
