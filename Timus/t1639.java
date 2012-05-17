import java.util.Scanner;

public class t1639 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int m = input.nextInt();
			int n = input.nextInt();
			
			if((m * n) % 2 != 1){
				System.out.println("[:=[first]");
			}
			else{
				System.out.println("[second]=:]");
			}
		}
	}
}
