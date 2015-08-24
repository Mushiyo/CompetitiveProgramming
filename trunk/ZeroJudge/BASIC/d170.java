/* Filename: d170.java
 * Author: Mushiyo
 */
package BASIC;

import java.util.Scanner;

public class d170 {

	public static void main(String[] args) {
		double[] x = new double[4];
		double[] y = new double[4];
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			while (n > 0) {
				for (int i = 1; i < x.length; ++i) {
					x[i] = input.nextInt();
					y[i] = input.nextInt();
				}

				if (x[2] - x[3] > 0 && x[3] - x[1] > 0) {
					if ((y[2] - y[3]) / (x[2] - x[3]) == (y[3] - y[1])
							/ (x[3] - x[1])) {
						System.out.println("該死的東西!竟敢想讓我死！");
					} else {
						System.out.println("父親大人!母親大人!我快到了！");
					}
				} else if (y[2] - y[3] > 0 && y[3] - y[1] > 0) {
					if ((x[2] - x[3]) / (y[2] - y[3]) == (x[3] - x[1])
							/ (y[3] - y[1])) {
						System.out.println("該死的東西!竟敢想讓我死！");
					} else {
						System.out.println("父親大人!母親大人!我快到了！");
					}
				} else {
					System.out.println("父親大人!母親大人!我快到了！");
				}

				--n;
			}
		}
	}

}
