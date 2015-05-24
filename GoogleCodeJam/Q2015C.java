// TLE on large

/* Filename: Q2015C.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2015C {
	final static int I = 2, J = 3, K = 4;

	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(System.out);
		Scanner input = new Scanner(new File("C-large.in"));
		PrintWriter out = new PrintWriter(new File("pC.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int caseNum = 1; caseNum <= T; ++caseNum) {
				int L = input.nextInt();
				long X = input.nextLong();
				String str = input.next();

				int product = 1;
				boolean gotI = false;
				boolean gotJ = false;
				for (long j = 0; j < X; ++j) {
					for (int i = 0; i < str.length(); ++i) {

						product = multiple(product, parseChar(str.charAt(i)));

						if (gotI == false) {
							if (product == I) {
								gotI = true;
							}
						} else if (gotJ == false) {
							if (product == K) {
								gotJ = true;
							}
						}
					}
				}

				// int[] backwardTimes = new int[repeat.length];
				// backwardTimes[backwardTimes.length - 1] =
				// repeat[repeat.length - 1];
				// for (int i = repeat.length - 2; i >= 0; --i) {
				// backwardTimes[i] = multiple(repeat[i], backwardTimes[i + 1]);
				// }

				// int[][] mid = new int[repeat.length][repeat.length];
				// for(int i = 1; i < mid[i].length - 1; ++i){
				// mid[i][i] = repeat[i];
				// for(int j = i + 1; j < mid[i].length - 1; ++j){
				// mid[i][j] = multiple(mid[i][j - 1], repeat[j]);
				// }
				// }

				boolean hasSol = gotJ && product == -1;
				// int firstI = nextIndex(forwardTimes, I, 0);
				// int lastK = prevIndex(backwardTimes, K, backwardTimes.length
				// - 1);
				//
				// while(lastK - firstI > 1){
				// if(mid[firstI + 1][lastK - 1] == J){
				// hasSol = true;
				// break;
				// }
				//
				// firstI = nextIndex(forwardTimes, I, 0);
				// lastK = nextIndex(backwardTimes, K, backwardTimes.length -
				// 1);
				// }

				if (hasSol) {
					out.printf("Case #%d: YES\n", caseNum);
				} else {
					out.printf("Case #%d: NO\n", caseNum);
				}
			}
		}

		input.close();
		out.close();
	}

	private static int nextIndex(int[] a, int target, int currentIndex) {
		for (int i = currentIndex; i < a.length; ++i) {
			if (a[i] == target) {
				return i;
			}
		}

		return a.length;
	}

	private static int prevIndex(int[] a, int target, int currentIndex) {
		for (int i = currentIndex; i >= 0; --i) {
			if (a[i] == target) {
				return i;
			}
		}

		return -1;
	}

	private static int parseChar(char c) {
		return c - 'i' + 2;
	}

	private static int multiple(int num1, int num2) {
		int absNum1 = Math.abs(num1);
		int absNum2 = Math.abs(num2);
		int ans = 1;

		if (absNum1 == 1 || absNum2 == 1) {
			ans = absNum1 * absNum2;
		} else if (absNum1 == I) {
			if (absNum2 == I) {
				ans = -1;
			} else if (absNum2 == J) {
				ans = K;
			} else if (absNum2 == K) {
				ans = -J;
			}
		} else if (absNum1 == J) {
			if (absNum2 == I) {
				ans = -K;
			} else if (absNum2 == J) {
				ans = -1;
			} else if (absNum2 == K) {
				ans = I;
			}
		} else if (absNum1 == K) {
			if (absNum2 == I) {
				ans = J;
			} else if (absNum2 == J) {
				ans = -I;
			} else if (absNum2 == K) {
				ans = -1;
			}
		}

		if (num1 < 0) {
			ans = -ans;
		}

		if (num2 < 0) {
			ans = -ans;
		}

		return ans;
	}
}
