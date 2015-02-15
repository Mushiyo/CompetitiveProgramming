/* Filename: UVa12096.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Stack;

public class UVa12096 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int T = input.nextInt();
			
			while(T > 0){
				int N = input.nextInt();
				Stack<Set<Set>> SetStack = new Stack<Set<Set>>(); 
				while(N > 0){
					String instruction = input.next();
					
					if(instruction.equals("PUSH")){
						SetStack.push(new HashSet<Set>());
					} else if(instruction.equals("DUP")){
						SetStack.push(SetStack.peek());
					} else if(instruction.equals("UNION")){
						Set<Set> s1 = SetStack.pop();
						Set<Set> s2 = SetStack.pop();
						s1.addAll(s2);
						SetStack.push(s1);
					} else if(instruction.equals("INTERSECT")){
						Set<Set> s1 = SetStack.pop();
						Set<Set> s2 = SetStack.pop();
						s1.retainAll(s2);
						SetStack.push(s1);
					} else { // ADD
						Set<Set> s1 = SetStack.pop();
						Set<Set> s2 = SetStack.pop();
						s1.add(s2);
						SetStack.push(s1);
					}
					
					System.out.println(SetStack.peek().size());
					
					--N;
				}
				
				System.out.println("***");
				
				--T;
			}
		}
	}

}
