import java.util.Scanner;

public class b079 {
	static int[] soundSum = new int[1000001];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		soundSum[1] = 1;
		soundSum[2] = 1;
		
		while(input.hasNext()){
			int n = input.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(A(n));
		}
	}
	
	public static int A(int n){
		for(int i = 1; i <= n; ++i){
			AHelper(i);
		}
		
		return(AHelper(n));
	}
	
	public static int AHelper(int n){
		if(soundSum[n] != 0){
			return soundSum[n];
		}
		else{
			soundSum[n] = soundSum[n - soundSum[n - 1]] + soundSum[(n - 1) - soundSum[n - 2]];
			return soundSum[n];
		}
	}
}
