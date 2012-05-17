import java.util.Scanner;

public class d693 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			if(N == 0){
				break;
			}
			
			int[] num = new int[N];
			
			for(int i = 0; i < num.length; ++i){
				num[i] = input.nextInt();
			}
			
			long lcmAll = num[0];
			for(int i = 1; i < num.length; ++i){
				lcmAll = lcm(lcmAll, num[i]);
			}
			
			System.out.println(lcmAll);
		}
	}

	public static long lcm(long a, long b){
		return Math.abs(a * b) / gcd(a, b);
	}
	
	public static int gcd(long a, long b) {
		while (Math.min(a, b) != 0) {
			if (a >= b) {
				long r = a % b;
				a = b;
				b = r;
			}
			else {
				long r = b % a;
				b = a;
				a = r;
			}
		}
		
		return (int)Math.max(a, b);
	}
}
