/* Filename: UVa484.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class UVa484 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<Integer, Integer> freqRec = new LinkedHashMap<Integer, Integer>();

		while (input.hasNext()) {
			int i = input.nextInt();
			if (freqRec.containsKey(i)) {
				int freq = freqRec.get(i);
				++freq;

				freqRec.put(i, freq);
			} else {
				freqRec.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> record : freqRec.entrySet()) {
			int num = record.getKey();
			int freq = record.getValue();

			System.out.println(num + " " + freq);
		}
	}

}
