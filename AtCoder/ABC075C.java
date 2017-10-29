/* Filename: ABC075C.java
 * Author: Mushiyo
 */
import java.util.Scanner;
import java.util.Arrays;

public class ABC075C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			int[][] graph = new int[N][N];
			
			for(int i = 0; i < M; ++i){
				int a = input.nextInt() - 1;
				int b = input.nextInt() - 1;
				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			
			int countBridge = 0;
			for(int i = 0; i < graph.length; ++i){
				for(int j = i + 1; j < graph[i].length; ++j){
					if(graph[i][j] == 1){
						graph[i][j] = 0;
						graph[j][i] = 0;
						
						boolean[] isVisited = new boolean[N];
						DFS(i, graph, isVisited);
						
						for(int v = 0; v < isVisited.length; ++v){
							if(isVisited[v] == false){
								++countBridge;
								break;
							}
						}
						
						graph[i][j] = 1;
						graph[j][i] = 1;
					}
				}
			}
			
			System.out.println(countBridge);
		}
	}

	private static void DFS(int current, int[][] graph, boolean[] isVisited){
		isVisited[current] = true;
		
		for(int i = 0; i < graph[current].length; ++i){
			if(graph[current][i] == 1){
				if(isVisited[i] == false){
					DFS(i, graph, isVisited);
				}
			}
		}
	}
}
