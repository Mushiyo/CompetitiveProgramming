/* Filename: Graph.java
 * Author: Mushiyo
 */

public class Graph {
	public static void floyd_warshall(int[][] graph){
		for(int mid = 0; mid < graph.length; ++mid){
			for(int u = 0; u < graph.length; ++u){
				for(int v = 0; v < graph[u].length; ++v){
					graph[u][v] = Math.min(graph[u][v], graph[u][mid] + graph[mid][v]);
				}
			}
		}
		
	}
}
