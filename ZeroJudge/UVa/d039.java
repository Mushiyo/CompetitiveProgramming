/* Filename: d039.java
 * Author: Mushiyo
 */
package UVa;

import java.util.Scanner;

public class d039 {

	public static void main(String[] args) {
		final int sonarCellW = 3, sonarCellH = 3;
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int t = input.nextInt();

			while (t > 0) {
				int n = input.nextInt();
				int m = input.nextInt();

				int horizontalSonarNum = (n - 2) / sonarCellW;
				if ((n - 2) % sonarCellW > 0) {
					++horizontalSonarNum;
				}

				int verticalSonarNum = (m - 2) / sonarCellH;
				if ((m - 2) % sonarCellH > 0) {
					++verticalSonarNum;
				}

				System.out.println(horizontalSonarNum * verticalSonarNum);

				--t;
			}
		}
	}

}
