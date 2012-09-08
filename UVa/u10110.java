import java.util.Scanner;

public class u10110 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			long n = input.nextLong();
			
			if(n == 0){
				break;
			}
			
			double sqrtN = Math.sqrt(n);
			
			if(Math.floor(sqrtN) == Math.ceil(sqrtN)){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}

}
