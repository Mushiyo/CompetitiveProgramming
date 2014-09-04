/* Filename: UVa12157.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa12157 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int caseNum = 1; caseNum <= T; ++caseNum) {
				int N = input.nextInt();
				int[] callDuration = new int[N];
				int Mile = 0;
				int Juice = 0;
				for (int i = 0; i < callDuration.length; ++i) {
					callDuration[i] = input.nextInt();

					Mile += (Math.floor((double)callDuration[i] / 30) + 1) * 10;
					Juice += (Math.floor((double)callDuration[i] / 60) + 1) * 15;
				}

				System.out.printf("Case %d: ", caseNum);
				if(Mile == Juice){
					System.out.printf("Mile Juice %d\n", Mile);
				}
				else if (Mile < Juice) {
					System.out.printf("Mile %d\n", Mile);
				} else {
					System.out.printf("Juice %d\n", Juice);
				}
			}
		}
	}

}
