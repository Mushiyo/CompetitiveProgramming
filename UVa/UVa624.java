/* Filename: UVa624.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UVa624 {
	static int N;
	static int trackNum;
	static int longestDuration;
	final static int MAX_TRACK_NUM = 20 + 1;
	static int[] CDTrack = new int[MAX_TRACK_NUM];
	static List<Integer> tape = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			N = input.nextInt();
			trackNum = input.nextInt();

			// initialize
			for (int i = 0; i < trackNum; ++i) {
				CDTrack[i] = input.nextInt();
			}
			tape.clear();
			longestDuration = 0;

			selectTrack(N, 0, new ArrayList<Integer>());

			for (int i : tape) {
				System.out.print(i + " ");
			}

			System.out.println("sum:" + longestDuration);
		}
	}

	public static void selectTrack(int remainLength, int index,
			List<Integer> selectedTrack) {

		if (longestDuration == N) {
			return;
		}

		if (index >= trackNum && remainLength >= 0) {
			if (remainLength < N - longestDuration) {
				tape.clear();
				tape.addAll(selectedTrack);

				longestDuration = N - remainLength;
			}
			return;
		}

		for (int i = index; i < trackNum; ++i) {
			if (remainLength < CDTrack[i]) {
				if (remainLength < N - longestDuration) {
					tape.clear();
					tape.addAll(selectedTrack);

					longestDuration = N - remainLength;
				}
			} else if (remainLength == CDTrack[i]) {
				tape.clear();
				tape.addAll(selectedTrack);
				tape.add(CDTrack[i]);
				longestDuration = N;
				break;
			} else {
				selectedTrack.add(CDTrack[i]);

				selectTrack(remainLength - CDTrack[i], i + 1, selectedTrack);
				
				selectedTrack.remove(selectedTrack.size() - 1);
			}
		}
	}
}
