//TLE & RE

package BASIC;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class a290 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int M = input.nextInt();

			boolean[][] roads = new boolean[N + 1][M];

			boolean[] visited = new boolean[N + 1];

			while (M > 0) {
				int a = input.nextInt();
				int b = input.nextInt();

				roads[a][b] = true;

				--M;
			}

			int A = input.nextInt();
			int B = input.nextInt();

			if (isReachable(A, B, roads, visited) == true) {
				System.out.println("Yes!!!");
			} else {
				System.out.println("No!!! ");
			}

		}

	}

	static boolean isReachable(int startCity, int targetCity,
			boolean[][] roads, boolean[] visited) {
		Queue<Integer> toBeVisit = new LinkedList<Integer>();
		toBeVisit.add(startCity);

		while (!toBeVisit.isEmpty()) {
			int currentCity = toBeVisit.poll();

			if (currentCity == targetCity) {
				return true;
			}

			for (int i = 0; i < roads[currentCity].length; ++i) {
				if (roads[currentCity][i] == true) {
					int neighborCity = i;
					if (!visited[neighborCity]) {
						toBeVisit.add(neighborCity);
						visited[neighborCity] = true;
					}
				}
			}

		}

		return false;
	}

}
