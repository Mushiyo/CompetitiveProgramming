/* Filename: UVa10503.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa10503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			int m = input.nextInt();
			Domino[] fills = new Domino[m];
			Domino head = new Domino(input.nextInt(), input.nextInt());
			Domino tail = new Domino(input.nextInt(), input.nextInt());

			for (int i = 0; i < fills.length; ++i) {
				fills[i] = new Domino(input.nextInt(), input.nextInt());
			}

			boolean[] isUsed = new boolean[m];
			Domino[] solitaire = new Domino[n + 2];
			solitaire[0] = head;
			solitaire[solitaire.length - 1] = tail;

			if (hasSolution(1, isUsed, fills, solitaire)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean hasSolution(int pos, boolean[] isUsed, Domino[] fills, Domino[] solitaire) {
		if (pos == solitaire.length - 1) {
			int tail = solitaire.length - 1;
			if (solitaire[pos - 1].right == solitaire[tail].left) {
				return true;
			}
		} else {
			boolean solutionFound = false;
			for (int i = 0; solutionFound == false && i < fills.length; ++i) {
				if (isUsed[i] == false) {
					if (solitaire[pos - 1].right == fills[i].left || solitaire[pos - 1].right == fills[i].right) {
						isUsed[i] = true;

						if (solitaire[pos - 1].right == fills[i].right) {
							fills[i].swap();
						}
						solitaire[pos] = fills[i];
						solutionFound = hasSolution(pos + 1, isUsed, fills, solitaire);
						isUsed[i] = false;
					}
				}				
			}

			if (solutionFound) {
				return true;
			}
		}

		return false;
	}

	private static class Domino {
		int left;
		int right;

		Domino(int left, int right) {
			this.left = left;
			this.right = right;
		}

		void swap() {
			int tmp = this.left;
			this.left = this.right;
			this.right = tmp;
		}
		
		public String toString(){
			return String.format("(%d, %d)", left, right);
		}
	}

}
