/* Filename: a787.java
 * Author: Mushiyo
 */
package CONTEST;

import java.util.Scanner;
import java.util.Arrays;

public class a787 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX_WIDTH = 36, MAX_HEIGHT = 24;
		char[][] pic = new char[MAX_HEIGHT][MAX_WIDTH];

		while (input.hasNext()) {
			String name = input.next();
			int width = input.nextInt();
			int height = input.nextInt();
			String cmd = input.next();
						
			for(int i = 0; i < height; ++i){
				System.arraycopy(input.next().toCharArray(), 0, pic[i], 0, width);
			}
			
			for(int i = 0; i < cmd.length(); ++i){
				if(cmd.charAt(i) == 'R'){
					reversePic(pic, width, height);
				} else if(cmd.charAt(i) == 'I'){
					reflectPic(pic, width, height);
				}
			}
			
			System.out.println(name);
			for(int i = 0; i < height; ++i){
				System.out.println(new String(pic[i], 0, width));
			}
		}
	}
	
	private static void reversePic(char[][] pic, int width, int height){
		for(int i = 0; i < height; ++i){
			for(int j = 0, k = width - 1; j < k; ++j, --k){
				char tmp = pic[i][j];
				pic[i][j] = pic[i][k];
				pic[i][k] = tmp;
			}
		}
	}
	
	private static void reflectPic(char[][] pic, int width, int height){
		for(int j = 0; j < width; ++j){
			for(int i = 0, k = height - 1; i < k; ++i, --k){
				char tmp = pic[i][j];
				pic[i][j] = pic[k][j];
				pic[k][j] = tmp;
			}
		}
	}
}
