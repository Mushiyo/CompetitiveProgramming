/* Filename: a982.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

public class a982 {
	static final int MAX_N = 100;
	static char[][] maze = new char[MAX_N][MAX_N];
	static int [][] dist = new int[MAX_N][MAX_N];
	static final int DIRECTION = 4;
	static final int[] dx = { 0, 0, -1, 1};
	static final int[] dy = {-1, 1, 0, 0};
	static final char EMPTY = '.', BLOCK = '#';

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			initDist(N);
			
			for(int r = 0; r < N; ++r){
				maze[r] = input.next().toCharArray();
			}
			
			final Point target = new Point(N - 1 - 1, N - 1 - 1);
			Queue<Point> bfsQueue = new LinkedList<Point>();
			bfsQueue.add(new Point(2 - 1, 2 - 1));
			maze[2 - 1][2 - 1] = BLOCK;
			dist[2 - 1][2 - 1] = 1;
			
			while(!bfsQueue.isEmpty()){
				Point current = bfsQueue.poll();
				
				if(current.equals(target)){
					break;
				}
				
				for(int d = 0; d < DIRECTION; ++d){
					int nx = current.x + dx[d], ny = current.y + dy[d];
					
					if(maze[nx][ny] == EMPTY){
						bfsQueue.add(new Point(nx, ny));
						dist[nx][ny] = dist[current.x][current.y] + 1;
						maze[nx][ny] = BLOCK;
					}
				}
			}
			
			if(dist[target.x][target.y] == -1){
				System.out.println("No solution!");
			} else {
				System.out.println(dist[target.x][target.y]);
			}
		}
	}
	
	static private class Point{
		int x, y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		boolean equals(Point p){
			return this.x == p.x && this.y == p.y;
		}
	}
	
	static void initDist(int N){
		for(int r = 0; r < N; ++r){
			Arrays.fill(dist[r], -1);
		}
	}
}
