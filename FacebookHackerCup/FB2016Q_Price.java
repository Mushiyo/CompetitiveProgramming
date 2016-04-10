/* Filename: FB2016Q_Price.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FB2016Q_Price {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File(
				"the_price_is_correct.txt"));
		PrintWriter out = new PrintWriter(new File("out.txt"));

		int T = input.nextInt();

		for (int t = 1; t <= T; ++t) {
			int N = input.nextInt();
			int P = input.nextInt();
			long[] accumulation = new long[N];

			accumulation[0] = input.nextInt();
			int winSeq = accumulation[0] <= P ? 1 : 0;
			for (int i = 1; i < N; ++i) {
				int B = input.nextInt();

				accumulation[i] = accumulation[i - 1] + B;

				if (B <= P) {
					++winSeq;
				}

				if (accumulation[i] <= P) {
					++winSeq;
				}
			}
			
			for(int i = 1; i < N - 1; ++i){
				for(int j = i + 1; j < N; ++j){
					if(accumulation[j] - accumulation[i - 1] <= P){ // sum of [i, j]
						++winSeq;
					}
				}
			}
			
			out.printf("Case #%d: %d\n", t, winSeq);
		}
		
		out.close();
	}
}
