// TLE on 8, try faster input

/* Filename: Timus1196.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Timus1196 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Set<Integer> professorList = new HashSet<Integer>();

		while (input.hasNext()) {
			int N = input.nextInt();
			professorList.clear();
			
			for(int i = 0; i < N; ++i){
				professorList.add(input.nextInt());
			}
			
			int M = input.nextInt();
			int numOfCoindience = 0;
			for(int i = 0; i < M; ++i){
				if(professorList.contains(input.nextInt())){
					++numOfCoindience;
				}
			}
			
			System.out.println(numOfCoindience);
			
		}
	}

}
