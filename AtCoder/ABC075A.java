import java.util.Scanner;

public class ABC075A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int A = input.nextInt();
			int B = input.nextInt();
			int C = input.nextInt();
			
			if(A == B){
				System.out.println(C);
			} else if (B == C){
				System.out.println(A);
			} else if (A == C){
				System.out.println(B);
			}
		}

	}

}
