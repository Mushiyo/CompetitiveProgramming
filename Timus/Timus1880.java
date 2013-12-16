import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Timus1880 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = input.nextInt();
		Set<Integer> eigenvalue = new HashSet<Integer>(n);
		
		addToSet(n, eigenvalue);
		
		while(input.hasNext()){
			n = input.nextInt();
			Set<Integer> nextBlock = new HashSet<Integer>(n);
			
			addToSet(n, nextBlock);
			
			eigenvalue.retainAll(nextBlock);
		}
		
		System.out.println(eigenvalue.size());
	}
    
	static void addToSet(int n, Set<Integer> set){
		while(n > 0){
			set.add(input.nextInt());
			--n;
		}
	}
}
