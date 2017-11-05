
/* Filename: ARC083D.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class ARC083D {

	public static void main(String[] args) {
		final int INF = Integer.MAX_VALUE;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			long[][] shortestPath = new long[N][N];

			for (int u = 0; u < shortestPath.length; ++u) {
				for (int v = 0; v < shortestPath[u].length; ++v) {
					shortestPath[u][v] = input.nextInt();
				}
			}

			long[][] graph = new long[N][N];
			for (int u = 0; u < graph.length; ++u) {
				graph[u][u] = 0;
				for (int v = u + 1; v < graph[u].length; ++v) {
					graph[u][v] = INF;
					graph[v][u] = INF;
				}
			}

			for (int u = 0; u < shortestPath.length; ++u) {
				for (int v = 0; v < shortestPath[u].length; ++v) {
					boolean hasMid = false;
					for (int mid = 0; mid < shortestPath.length; ++mid) {
						if (shortestPath[u][mid] + shortestPath[mid][v] == shortestPath[u][v]) {
							if (mid != u && mid != v) {
								hasMid = true;
							}
						}
					}

					if (hasMid == false) {
						graph[u][v] = shortestPath[u][v];
						graph[v][u] = shortestPath[u][v];
					}
				}
			}

			long[][] Floyd_Warshall = new long[N][N];
			for (int i = 0; i < Floyd_Warshall.length; ++i) {
				System.arraycopy(graph[i], 0, Floyd_Warshall[i], 0, graph.length);
			}

			for (int mid = 0; mid < Floyd_Warshall.length; ++mid) {
				for (int u = 0; u < Floyd_Warshall.length; ++u) {
					for (int v = 0; v < Floyd_Warshall[u].length; ++v) {
						Floyd_Warshall[u][v] = Math.min(Floyd_Warshall[u][v],
								Floyd_Warshall[u][mid] + Floyd_Warshall[mid][v]);
					}
				}
			}

			boolean isExist = true;
			for (int i = 0; i < shortestPath.length; ++i) {
				if (Arrays.equals(shortestPath[i], Floyd_Warshall[i]) == false) {
					isExist = false;
					break;
				}
			}

			if (isExist) {
				long pathLen = 0;
				for (int u = 0; u < graph.length; ++u) {
					for (int v = u + 1; v < graph[u].length; ++v) {
						if (graph[u][v] != INF) {
							pathLen += graph[u][v];
						}
					}
				}

				System.out.println(pathLen);
			} else {
				System.out.println(-1);
			}
		}
	}

}
