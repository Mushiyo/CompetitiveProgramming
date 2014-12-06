// TLE

/* Filename: UVa10763.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UVa10763 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			Set<Pair> waitParing = new HashSet<Pair>();

			while (n > 0) {
				Pair p = new Pair(input.nextInt(), input.nextInt());

				if (waitParing.contains(Pair.reverse(p))) {
					waitParing.remove(Pair.reverse(p));
				} else {
					waitParing.add(p);
				}

				--n;
			}

			if (waitParing.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	static private class Pair {
		int original;
		int target;

		Pair(int original, int target) {
			this.original = original;
			this.target = target;
		}

		static Pair reverse(Pair p) {
			return new Pair(p.target, p.original);
		}
	}

}
