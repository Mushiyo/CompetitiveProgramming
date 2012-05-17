import java.util.Arrays;
import java.util.Scanner;

public class d153 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt();
		while(T > 0){
			int N = input.nextInt();
			int[] scores = new int[N];
			for(int i = 0; i < scores.length; ++i){
				scores[i] = input.nextInt();
			}
			
			Arrays.sort(scores);
			
			if(N % 2 != 0){
				System.out.println(scores[N / 2]);
			}
			else{
				System.out.println(scores[(N / 2) - 1]);
			}
			
			--T;
		}
	}

}
