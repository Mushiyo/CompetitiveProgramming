/* Filename: UVa10935.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Arrays;

public class UVa10935 {
	final static int MAX_N = 50 + 1; 
	static boolean[] cardInDeck = new boolean[MAX_N];
	static int[] discardedCard = new int[MAX_N]; 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			Arrays.fill(cardInDeck, 0, n, true);
			
			int remainingCard = findRemainCard(n);	
			System.out.print("Discarded cards:");
			if(n - 1 > 0){
				System.out.printf(" %d", discardedCard[0]);
				for(int i = 1; i < n - 1; ++i){
					System.out.printf(", %d", discardedCard[i]);
				}
			}
			System.out.println();
			System.out.printf("Remaining card: %d\n", remainingCard);
		}
	}
	
	static int findRemainCard(int n){
		int countDiscard = 0;
		int cursor = 0;
		while(countDiscard < n - 1){
			while(cardInDeck[cursor] == false){
				++cursor;
				cursor %= n;
			}
			
			cardInDeck[cursor] = false;
			discardedCard[countDiscard] = cursor + 1;
			++countDiscard;
			
			while(cardInDeck[cursor] == false){
				++cursor;
				cursor %= n;
			}
			++cursor;
		}
		
		while(cardInDeck[cursor] == false){
			++cursor;
			cursor %= n;
		}
		
		return cursor + 1;
	}
}
