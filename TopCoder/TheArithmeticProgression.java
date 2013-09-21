import java.util.Scanner;

public class TheArithmeticProgression {
	public double minimumChange(int a, int b, int c) {
		if(isAP(a, b, c)){
			return 0.0;
		}
		
		double newA = b - (c - b);
		double diffA = Math.abs(a - newA);
		double newB = (c - a) / 2.0;
		double diffB = Math.abs(b - newB);
		double newC = b + (b - a);
		double diffC = Math.abs(c - newC);
		
		return Math.min(diffA, Math.min(diffC, diffB));
	}
	
	boolean isAP(int a, int b, int c){
		return b - a == c - b;
	}

//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		while(input.hasNext()){
//			System.out.println(minimumChange(input.nextInt(), input.nextInt(), input.nextInt()));
//		}
//	}

}
