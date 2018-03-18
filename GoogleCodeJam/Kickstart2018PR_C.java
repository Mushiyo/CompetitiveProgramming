
/* Filename: Kickstart2018PR_C.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Kickstart2018PR_C {
	public static void main(String[] args) throws FileNotFoundException {
		// Scanner input = new Scanner(System.in);
		// PrintWriter out = new PrintWriter(System.out);
		Scanner input = new Scanner(new File("C-large.in"));
		PrintWriter out = new PrintWriter(new File("pC.out"));

		while (input.hasNext()) {
			int T = input.nextInt();

			for (int t = 1; t <= T; ++t) {
				int N = input.nextInt();
				Ticket[] tickets = new Ticket[N];

				for (int i = 0; i < tickets.length; ++i) {
					tickets[i] = new Ticket(input.next(), input.next());
				}

				int[] next = new int[N];
				int[] prev = new int[N];
				Arrays.fill(next, -1);
				Arrays.fill(prev, -1);
				for (int i = 0; i < tickets.length; ++i) {
					for (int j = 0; j < tickets.length; ++j) {
						if (i != j) {
							if (tickets[i].source.equals(tickets[j].destination)) {
								prev[i] = j;
							}

							if (tickets[i].destination.equals(tickets[j].source)) {
								next[i] = j;
							}
						}
					}
				}

				int first = -1;
				for (int i = 0; i < prev.length; ++i) {
					if (prev[i] == -1) {
						first = i;
						break;
					}
				}

				out.printf("Case #%d:", t);
				int current = first;
				while (current != -1) {
					out.printf(" %s", tickets[current]);
					current = next[current];
				}

				out.println();
			}
		}

		out.close();
		input.close();
	}

	static class Ticket {
		String source;
		String destination;

		Ticket(String s, String d) {
			this.source = s;
			this.destination = d;
		}

		public String toString() {
			return String.format("%s-%s", source, destination);

		}
	}
}
