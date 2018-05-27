
/* Filename: Kickstart2018RC_A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Kickstart2018RC_A {
	final static int INF = 1 << 20;

	public static void main(String[] args) throws FileNotFoundException {
		final boolean STD_IO = false;
		final String INPUT_FILE = "A-large.in";
		InputStream inStream = STD_IO ? System.in : new FileInputStream(new File(INPUT_FILE));
		OutputStream outStream = STD_IO ? System.out : new FileOutputStream(new File("GCJ.out"));
		Scanner input = new Scanner(inStream);
		PrintWriter out = new PrintWriter(outStream);

		final int MAX_N = 1000;
		int[][] graph = new int[MAX_N][MAX_N];
		int[][] dist = new int[MAX_N][MAX_N];
		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();

				initialize(graph, N);

				for (int i = 0; i < N; ++i) {
					int x = input.nextInt() - 1;
					int y = input.nextInt() - 1;

					graph[x][y] = 1;
					graph[y][x] = 1;
				}

				copyGraph(graph, dist, N);
				Floyd_Warsahll(dist, N);
				boolean[] isOnCirle = new boolean[N];
				int[] parent = new int[N];
				for (int i = 0; i < N; ++i) {
					Arrays.fill(isOnCirle, false);
					Arrays.fill(parent, -1);
					parent[i] = N + 1;

					boolean foundCircle = dfs(graph, N, parent, i, isOnCirle);

					if (foundCircle) {
						break;
					}
				}

				int[] distToCircle = new int[N];
				Arrays.fill(distToCircle, INF);
				for (int i = 0; i < N; ++i) {
					if (isOnCirle[i]) {
						distToCircle[i] = 0;
					} else {
						for (int j = 0; j < N; ++j) {
							if (isOnCirle[j]) {
								distToCircle[i] = Math.min(distToCircle[i], dist[i][j]);
							}
						}
					}
				}

				out.printf("Case #%d:", t);
				for (int i : distToCircle) {
					out.printf(" %d", i);
				}
				out.println();
			}
		}

		out.close();
		input.close();
	}

	private static void initialize(int[][] graph, int N) {
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				graph[i][j] = INF;
			}
		}
	}

	private static void copyGraph(int[][] source, int[][] dist, int N) {
		for (int i = 0; i < N; ++i) {
			System.arraycopy(source[i], 0, dist[i], 0, N);
		}
	}

	private static void Floyd_Warsahll(int[][] graph, int N) {
		for (int mid = 0; mid < N; ++mid) {
			for (int u = 0; u < N; ++u) {
				for (int v = 0; v < N; ++v) {
					graph[u][v] = Math.min(graph[u][v], graph[u][mid] + graph[mid][v]);
				}
			}
		}
	}

	private static boolean dfs(int[][] graph, int N, int[] parent, int current, boolean[] isOnCircle) {
		for (int i = 0; i < N; ++i) {
			if (graph[current][i] < INF) { // is reachable
				if (parent[i] == -1) {
					parent[i] = current;
					boolean isCircleFound = dfs(graph, N, parent, i, isOnCircle);

					if (isCircleFound) {
						return true;
					}
				} else if (parent[current] != i) { // circle found
					isOnCircle[i] = true;
					isOnCircle[current] = true;
					int prev = parent[current];
					while (prev != i) {
						isOnCircle[prev] = true;
						prev = parent[prev];
					}

					return true;
				}
			}
		}

		return false;
	}
}