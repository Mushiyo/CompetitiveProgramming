/* Filename: UVa10763.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.awt.Point;

public class UVa10763 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<Point, Integer> waitPairing = new HashMap<Point, Integer>();

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			waitPairing.clear();

			while (n > 0) {
				Point p = new Point(input.nextInt(), input.nextInt());
				Point revP = new Point(p.y, p.x);

				if (waitPairing.containsKey(revP)) {
					int numOfPeople = waitPairing.get(revP);
					if (numOfPeople > 1) {
						--numOfPeople;
						waitPairing.put(revP, numOfPeople);
					} else {
						waitPairing.remove(revP);
					}
				} else {
					if (waitPairing.containsKey(p)) {
						int numOfPeople = waitPairing.get(p) + 1;
						waitPairing.put(p, numOfPeople);
					} else {
						waitPairing.put(p, 1);
					}
				}

				--n;
			}

			if (waitPairing.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
