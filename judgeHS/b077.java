import java.util.Scanner;

public class b077 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long M = input.nextLong();
		long N = input.nextLong();
		
		while(M != 0 && N != 0){
			if(M > N){
				System.out.println("Unfair");
			}
			else{
				System.out.println("Fair");
			}
			
			
			M = input.nextLong();
			N = input.nextLong();
		}
	}

}
