/* Filename: UVa821.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa821 {
	public static void main(String[] args) {
		final int INF = Short.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		int caseNum = 1;
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			int[][] graph = new int[100 + 1][100 + 1];
			
			for(int u = 0; u < graph.length; ++u){
				for(int v = 0; v < graph[u].length; ++v){
					graph[u][v] = INF;
				}
				graph[u][u] = 0;
			}
			
			if(a == 0 && b == 0){
				break;
			} else {
				while(a != 0 && b != 0){
					graph[a][b] = 1;
					
					a = input.nextInt();
					b = input.nextInt();
				}
				
				// Floyd-Warshall
				for(int mid = 0; mid < graph.length; ++mid){
					for(int u = 0; u < graph.length; ++u){
						for(int v = 0; v < graph[u].length; ++v){
							graph[u][v] = Math.min(graph[u][v], graph[u][mid]+ graph[mid][v]);
							//System.err.println(graph[u][v]);
						}
					}
				}
				
				int totalPathLen = 0;
				int pairNum = 0;
				for(int u = 0; u < graph.length; ++u){
					for(int v = 0; v < graph[u].length; ++v){
						if(graph[u][v] < INF && u != v){
							totalPathLen += graph[u][v];
							++pairNum;
						}
					}
				}

				double avgPathLen = (double) totalPathLen / pairNum;
				System.out.printf("Case %d: average length between pages = %.3f clicks\n", caseNum, avgPathLen);
				++caseNum;
			}
			
		}
	}

}
