/*
ID: mushiyo1
LANG: JAVA
TASK: milk
*/

import java.util.Scanner;
import java.io.*;

public class milk {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("milk.in"));
		PrintWriter output = new PrintWriter(new File("milk.out"));
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			
			int[] amountOffered = new int[1001];
			while(M > 0){
				int price = input.nextInt();
				int amount = input.nextInt();
				
				amountOffered[price] += amount;
				
				--M;
			}
			
			int amountCollected = 0;
			int cost = 0;
			for(int i = 0; i < amountOffered.length; ++i){
				if(amountCollected < N){
					if(amountCollected + amountOffered[i] < N){
						cost += i * amountOffered[i];
						amountCollected += amountOffered[i];
					}
					else{
						cost += i * (N - amountCollected);
						amountCollected += N - amountCollected;
					}
				}
				else{
					break;
				}
			}
			
			output.println(cost);
		}
		
		input.close();
		output.close();
	}

}
