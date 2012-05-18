//WA
import java.util.Scanner;
import java.util.TreeSet;

public class u11462 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TreeSet<Integer> age = new TreeSet<Integer>();
		
		int n = input.nextInt();
		while(n != 0){
			for(int i = 0; i < n; ++i){
				age.add(input.nextInt());
			}
			
			for(int i : age){
				System.out.print(i + " ");
			}
			
			System.out.println();
			age.clear();
			n = input.nextInt();
		}
	}
}
