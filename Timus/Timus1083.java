import java.util.Scanner;

public class Timus1083 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int k = input.next().length();

			System.out.println(factorials(n, k));
		}
	}
	
	public static int factorials(int n, int k){
		int result = 1;
		
		if((n % k) == 0){
			for(int i = n; i >= k; i -= k){
				result *= i;
			}
		}
		else{
			for(int i = n; i >= (n % k); i -= k){
				result *= i;
			}
		}
		
		return result;
	}
}
