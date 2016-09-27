/* Filename: Codeforces707B.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Codeforces707B {
	static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt(), m = input.nextInt(), k = input.nextInt();
			List<Node>[] neighborDist = new ArrayList[n + 1];

			for (int i = 0; i < m; ++i) {
				int u = input.nextInt();
				int v = input.nextInt();
				int l = input.nextInt();

				if (neighborDist[u] == null) {
					neighborDist[u] = new ArrayList<Node>();
				}

				if (neighborDist[v] == null) {
					neighborDist[v] = new ArrayList<Node>();
				}

				neighborDist[u].add(new Node(v, l));
				neighborDist[v].add(new Node(u, l));
			}

			int[] a = new int[k];
			Set<Integer> isStorage = new HashSet<Integer>();
			for (int i = 0; i < a.length; ++i) {
				a[i] = input.nextInt();
				isStorage.add(a[i]);
			}

			int minCost = Integer.MAX_VALUE;
			for (int i = 0; i < a.length; ++i) {
				if (neighborDist[a[i]] != null) {
					for (int j = 0; j < neighborDist[a[i]].size(); ++j) {
						Node node = neighborDist[a[i]].get(j);
						if (isStorage.contains(node.vertex) == false) {
							minCost = Math.min(minCost, node.weight);
						}
					}
				}
			}

			if (minCost < INF) {
				System.out.println(minCost);
			} else {
				System.out.println("-1");
			}

		}
	}

	static class Node {
		int vertex;
		int weight;

		Node(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}
}
