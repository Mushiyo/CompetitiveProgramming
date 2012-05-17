import java.util.Scanner;

public class t1068 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			System.out.println(sumOneToN(N));
		}
	}
	
	public static int sumOneToN(int N){
		int sum = 0;
		if(Math.max(1, N) != 1){
			for(int i = 1; i <= N; ++i){
				sum += i;
			}
		}
		else{
			for(int i = N; i <= 1; ++i){
				sum += i;
			}
		}
		
		return sum;
	}

}
