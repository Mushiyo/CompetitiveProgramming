/* Filename: UVa10534.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class UVa10534 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int[] seq = new int[N];

			for (int i = 0; i < seq.length; ++i) {
				seq[i] = input.nextInt();
			}

			int[] LISDP = new int[N];
			ArrayList<Integer> LISHelper = new ArrayList<Integer>();
			for (int i = 0; i < seq.length; ++i) {
				int insPoint = Collections.binarySearch(LISHelper, seq[i]);
				insPoint = Math.max(insPoint, -(insPoint + 1));
				LISDP[i] = insPoint;
				
				if(insPoint == LISHelper.size()){
					LISHelper.add(insPoint, seq[i]);
				} else {
					LISHelper.set(insPoint, seq[i]);
				}
			}

			int[] revLDSDP = new int[N];
			ArrayList<Integer> revLDSDPHelper = new ArrayList<Integer>();
			for (int i = seq.length - 1; i >= 0; --i) {
				int insPoint = Collections.binarySearch(revLDSDPHelper, seq[i]);
				insPoint = Math.max(insPoint, -(insPoint + 1));
				revLDSDP[i] = insPoint;
				
				if(insPoint == revLDSDPHelper.size()){
					revLDSDPHelper.add(insPoint, seq[i]);
				} else {
					revLDSDPHelper.set(insPoint, seq[i]);
				}
			}

			int longestWavioSeqLen = 1;
			for (int i = 0; i < LISDP.length; ++i) {
				longestWavioSeqLen = Math.max(longestWavioSeqLen, 2 * Math.min(LISDP[i], revLDSDP[i]) + 1);
			}

			System.out.println(longestWavioSeqLen);
		}
	}

}
