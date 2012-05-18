import java.util.Scanner;

public class u11461 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		while(a != 0 && b != 0){
			int numOfSquare = 0;
			for(int i = a; i <= b; ++i){
				Double sqrtI = Math.sqrt(i);
				
				if(sqrtI == sqrtI.intValue()){
					++numOfSquare;
				}
			}
			
			System.out.println(numOfSquare);
			
			a = input.nextInt();
			b = input.nextInt();
		}
	}

}
