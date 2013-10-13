package UVa;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

;

public class c012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> inputList = new ArrayList<String>();

		while (input.hasNext()) {
			inputList.add(input.nextLine());
		}

		for (int i = 0; i < inputList.size(); ++i) {
			String s = inputList.get(i);
			Map<Character, FreqRecord> freqRecord = new HashMap<Character, FreqRecord>();

			for (int j = 0; j < s.length(); ++j) {
				if (freqRecord.containsKey(s.charAt(j))) {
					FreqRecord rec = freqRecord.get(s.charAt(j));
					++rec.freq;
					freqRecord.put(s.charAt(j), rec);
				} else {
					freqRecord.put(s.charAt(j), new FreqRecord(s.charAt(j), 1));
				}
			}

			FreqRecord[] records = freqRecord.values().toArray(
					new FreqRecord[freqRecord.size()]);
			Arrays.sort(records);

			for (int j = 0; j < records.length; ++j) {
				System.out.println((int) records[j].c + " " + records[j].freq);
			}

			if (i != inputList.size() - 1) {
				System.out.println();
			}
		}
	}

}

class FreqRecord implements Comparator<FreqRecord>, Comparable<FreqRecord> {
	char c;
	int freq;

	public FreqRecord(char c, int freq) {
		this.c = c;
		this.freq = freq;
	}

	public int compare(FreqRecord r1, FreqRecord r2) {
		if (r1.freq > r2.freq) {
			return 1;
		} else if (r1.freq < r2.freq) {
			return -1;
		} else {
			if (r1.c > r2.c) {
				return -1;
			} else if (r1.c < r2.c) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	@Override
	public int compareTo(FreqRecord other) {
		if (this.freq > other.freq) {
			return 1;
		} else if (this.freq < other.freq) {
			return -1;
		} else {
			if (this.c > other.c) {
				return -1;
			} else if (this.c < other.c) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
