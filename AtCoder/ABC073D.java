/* Filename: ABC073D.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class ABC073D {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int INF = 1 << 29; 
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			int R = input.nextInt();
			int[] r = new int[R];
			
			for(int i = 0; i < r.length; ++i){
				r[i] = input.nextInt();
			}
			
			int[][] dist = new int[N + 1][N + 1];
			for(int i = 0; i < dist.length; ++i){
				for(int j = 0; j < dist[i].length; ++j){
					dist[i][j] = INF;
				}
				
				dist[i][i] = 0;
				dist[0][i] = 0;
			}
			
			while(M > 0){
				int A = input.nextInt();
				int B = input.nextInt();
				int C = input.nextInt();
				
				if(C < dist[A][B]){
					dist[A][B] = C;
					dist[B][A] = C;
				}
				
				--M;
			}
			
			floyd_warshall(dist);
			boolean[] isVisited = new boolean[R];
			int ans = findShortest(0, 0, R, 0, Integer.MAX_VALUE, isVisited, r, dist);
			
			System.out.println(ans);
		}
	}
	
	private static int findShortest(int prev, int visitedNum, int total, int currentDist, int currentMin, boolean[] isVisited, int[] r, int[][] dist){
		if(visitedNum == total){
			return Math.min(currentDist, currentMin);
		} else{
			for(int i = 0; i < isVisited.length; ++i){
				if(isVisited[i] == false){
					isVisited[i] = true;
					int min = findShortest(r[i], visitedNum + 1, total, currentDist + dist[prev][r[i]], currentMin, isVisited, r, dist);
					currentMin = Math.min(min, currentMin);
					isVisited[i] = false;
				}
			}
		}
		
		return currentMin;
	}
	
	private static void floyd_warshall(int[][] graph){
		for(int mid = 0; mid < graph.length; ++mid){
			for(int u = 0; u < graph.length; ++u){
				for(int v = 0; v < graph[u].length; ++v){
					graph[u][v] = Math.min(graph[u][v], graph[u][mid] + graph[mid][v]);
				}
			}
		}
		
	}
}
