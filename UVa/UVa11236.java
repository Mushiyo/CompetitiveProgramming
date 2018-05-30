/* Filename: UVa11236.java
 * Author: Mushiyo
 */

public class UVa11236 {
	public static void main(String[] args) {
		for (int i = 1; i < 2000; ++i) {
			for (int j = i; i + j < 2000; ++j) {
				for (int k = j; i + j + k < 2000; ++k) {
					double l = (1e6 * (i + j + k)) / (i * j * k - 1e6);
					if (Math.ceil(l) == Math.floor(l) && 2000 > l && l >= k) {
						if (i + j + k + (int) l <= 2000)
							System.out.printf("%.2f %.2f %.2f %.2f\n", i / 100.0, j / 100.0, k / 100.0, l / 100.0);
					}
				}
			}
		}
	}

}
