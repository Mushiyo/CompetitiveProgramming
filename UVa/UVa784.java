/* Filename: UVa784.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa784 {
	final static int[] dx = {-1, 0, 1, 0};
	final static int[] dy = {0, -1, 0, 1}; 
	//               left, up, right, down
	final static int DIRECTIONS = 4;
	final static int MAX_HEIGHT = 30 + 1;
	final static int MAX_WIDTH = 80;
	final static char[][] maze = new char[MAX_HEIGHT][MAX_WIDTH];
	final static char WALL = 'X';
	final static char PAINT = '#';
	final static char START_ROOM = '*';
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		while (input.hasNext()) {
			int mazeNum = input.nextInt();
			
			input.nextLine(); // eat change line
			
			while(mazeNum > 0){
				int startX = 0, startY = 0;
				int height = 0;
				
				while(true){
					String rowOfMaze = input.nextLine();
					maze[height] = rowOfMaze.toCharArray();
					
					if(rowOfMaze.matches("_+")){
						++height;
						break;
					}
					
					for(int i = 0; i < maze[height].length; ++i){
						if(maze[height][i] == START_ROOM){
							startX = i;
							startY = height;
							break;
						}
					}
					
					++height;
				}
				
				dfs(startX, startY);
				
				for(int i = 0; i < height; ++i){
					System.out.println(maze[i]);
				}
				
				--mazeNum;
			}
		}
	}
	
	public static void dfs(int x, int y){
		if(maze[y][x] == WALL || maze[y][x] == PAINT){
			return;
		}
		else{
			maze[y][x] = PAINT;
		}
		
		for(int d = 0; d < DIRECTIONS; ++d){
			dfs(x + dx[d], y + dy[d]);
		}
	}
}
