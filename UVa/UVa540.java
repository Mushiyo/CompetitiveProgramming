/* Filename: UVa540.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

public class UVa540 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			int t = input.nextInt();

			if (t == 0) {
				break;
			}

			Map<Integer, Integer> teamList = new HashMap<Integer, Integer>();

			for (int i = 0; i < t; ++i) {
				int elementNum = input.nextInt();

				for (int e = 0; e < elementNum; ++e) {
					teamList.put(input.nextInt(), i);
				}
			}

			Queue<Queue<Integer>> teamQueue = new LinkedList<Queue<Integer>>();
			ArrayList<Queue<Integer>> teamMateQueue = new ArrayList<Queue<Integer>>(
					t);

			for (int i = 0; i < t; ++i) {
				teamMateQueue.add(new LinkedList<Integer>());
			}

			System.out.printf("Scenario #%d\n", caseNum);
			++caseNum;

			String cmd = input.next();
			while (!cmd.equals("STOP")) {
				if (cmd.equals("ENQUEUE")) {
					int id = input.nextInt();
					Queue<Integer> team = teamMateQueue.get(teamList.get(id));

					if (team.isEmpty()) {
						teamQueue.add(team);
					}

					team.add(id);
				} else { // DEQUEUE
					System.out.println(teamQueue.peek().poll());
					
					if(teamQueue.peek().isEmpty()){
						teamQueue.poll();
					}
				}
				
				cmd = input.next();
			}
			
			System.out.println();
		}
	}

}
