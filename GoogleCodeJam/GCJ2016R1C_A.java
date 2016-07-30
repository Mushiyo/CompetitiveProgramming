/* Filename: GCJ2016R1C_A.java
 * Author: Mushiyo
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collections;

public class GCJ2016R1C_A {
	public static void main(String[] args) throws FileNotFoundException {
//		 Scanner input = new Scanner(System.in);
//		 PrintWriter out = new PrintWriter(System.out);
		 Scanner input = new Scanner(new File("A-large.in"));
		 PrintWriter out = new PrintWriter(new File("pA.out"));
		 
		 final int MAX_N = 26;

		while (input.hasNext()) {
			int T = input.nextInt();
			PriorityQueue<Pair> pq = new PriorityQueue<>(MAX_N, Collections.reverseOrder());
			
			for (int t = 1; t <= T; ++t) {
				pq.clear();
				
				int N = input.nextInt();
				
				for(int party = 0; party < N; ++party){
					int numOfParty = input.nextInt();
					pq.add(new Pair(party, numOfParty));
				}
				
				out.printf("Case #%d:", t);
				
				while(pq.isEmpty() == false){
					//System.out.println(pq.toString());
					Pair p = pq.poll();
					
					out.printf(" %c", p.party + 'A');
					--p.number;
					--N;
					
					if(p.number > 0){
						pq.add(p);
					}
					//System.out.println("@" + pq.toString());
					if(pq.isEmpty() == false && pq.peek().number * 2 >= N){
						p = pq.poll();
						
						if(pq.size() == 1 && p.number == 1){
							pq.add(p);
							continue;
						}
						
						out.printf("%c", p.party + 'A');
						--p.number;
						--N;
						
						if(p.number > 0){
							pq.add(p);
						}
					}
				}
				out.println();
			}
		}

		out.close();
		input.close();
	}

	private static class Pair implements Comparable<Object> {
		int party;
		int number;

		Pair(int party, int number) {
			this.party = party;
			this.number = number;
		}

		@Override
		public int compareTo(Object o) {
			return this.number - ((Pair) o).number;
		}
		
		public String toString(){
			return String.format("%d:%d", party, number);
		}
	}
}
