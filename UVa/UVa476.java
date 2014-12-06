/* Filename: UVa476.java
 * Author: Mushiyo
 */

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Scanner;

public class UVa476 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			ArrayList<Rectangle2D.Double> rectangles = new ArrayList<Rectangle2D.Double>();

			while (true) {
				String type = input.next();

				if (type.equals("*")) {
					break;
				}

				double x1 = input.nextDouble();
				double y1 = input.nextDouble();
				double x2 = input.nextDouble();
				double y2 = input.nextDouble();
				double width = Math.abs(x1 - x2);
				double height = Math.abs(y1 - y2);

				rectangles.add(new Rectangle2D.Double(x1, y1, width, height));
			}
			
			for(Rectangle2D.Double i : rectangles){
				System.out.println(i);
			}

			int pointNum = 1;
			while (true) {
				double x = input.nextDouble();
				double y = input.nextDouble();
				System.out.println(x + " " + y);
				
				if(x == 9999.9 && y == 9999.9){
					break;
				}

				boolean isContained = false;
				for (int i = 0; i < rectangles.size(); ++i) {
					if (rectangles.get(i).contains(x, y)) {
						System.out.printf(
								"Point %d is contained in figure %d\n",
								pointNum, i + 1);

						isContained = true;
					}
				}

				if (isContained == false) {
					System.out.printf(
							"Point %d is not contained in any figure\n",
							pointNum);
				}

				++pointNum;
			}
		}
	}
}
