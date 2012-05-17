import java.util.Scanner;

public class d306 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int pairNum = 1;
		
		while(N > 0){
			int S1 = Integer.parseInt(input.next(), 2);
			int S2 = Integer.parseInt(input.next(), 2);
			
			System.out.print("Pair #" + pairNum + ": ");
			if(gcd(S1, S2) != 1){
				System.out.println("All you need is love!");
			}
			else{
				System.out.println("Love is not all you need!");
			}
			
			++pairNum;
			--N;
		}
	}
	
	public static int gcd(int a, int b){
		while(Math.min(a,b) != 0){
			if(a >= b){
				int r = a % b;
				a = b;
				b = r;
			}
			else{
				int r = b % a;
				b = a;
				a = r;
			}
		}
		
		return Math.max(a, b);
	}
}
