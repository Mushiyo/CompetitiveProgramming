package UVa;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.awt.Point;

public class c082 {
	static final int N = 0, E = 1, S = 2, W = 3;
	static final int[] leftDirection = { W, N, E, S };
	static final int[] rightDirection = { E, S, W, N };
	static final char[] charDirection = { 'N', 'E', 'S', 'W' };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int boundaryX = input.nextInt();
		int boundaryY = input.nextInt();
		Map<Point, Boolean> scent = new HashMap<Point, Boolean>();

		while (input.hasNext()) {
			int currentX = input.nextInt();
			int currentY = input.nextInt();
			char directionChar = input.next().charAt(0);
			int direction = 0;

			switch (directionChar) {
			case 'N':
				direction = N;
				break;
			case 'E':
				direction = E;
				break;
			case 'S':
				direction = S;
				break;
			case 'W':
				direction = W;
				break;
			}

			String instrucion = input.next();

			boolean outOfBound = false;
			for (int i = 0; i < instrucion.length(); ++i) {
				directionChar = instrucion.charAt(i);

				int newX = currentX;
				int newY = currentY;

				switch (directionChar) {
				case 'R':
					direction = rightDirection[direction];
					break;
				case 'L':
					direction = leftDirection[direction];
					break;
				case 'F':
					switch (direction) {
					case N:
						++newY;
						break;
					case E:
						++newX;
						break;
					case S:
						--newY;
						break;
					case W:
						--newX;
						break;
					}

					break;
				}

				if (newX < 0 || newY < 0 || newX > boundaryX
						|| newY > boundaryY) {
					Point p = new Point(currentX, currentY);

					if (!scent.containsKey(p)) {
						scent.put(p, true);
						outOfBound = true;

						break;
					}

				} else {
					currentX = newX;
					currentY = newY;
				}
			}

			if (outOfBound) {
				System.out.println(currentX + " " + currentY + " " + charDirection[direction] + " LOST");
			}else{
				System.out.println(currentX + " " + currentY + " " + charDirection[direction]);
			}

		}
	}
}