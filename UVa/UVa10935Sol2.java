/* Filename: UVa10935Sol2.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class UVa10935Sol2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			if (n == 0) {
				break;
			}

			Queue<Integer> remainingCard = new LinkedList<Integer>();
			for(int i = 1; i <= n; ++i){
				remainingCard.add(i);
			}
			
			System.out.print("Discarded cards:");
			boolean isFirstDiscardedCard = true;
			while(remainingCard.size() > 1){
				int card = remainingCard.poll();
				
				if(isFirstDiscardedCard){
					isFirstDiscardedCard = false;
					System.out.printf(" %d", card);
				} else {
					System.out.printf(", %d", card);
				}
				
				remainingCard.add(remainingCard.poll());
			}
			
			System.out.println();
			System.out.printf("Remaining card: %d\n", remainingCard.peek());
		}
	}

}
