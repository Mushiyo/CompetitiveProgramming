import java.util.Scanner;

public class b101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			int[] collection = new int[42];
			
			if(N == 0){
				break;
			}
			
			while(N > 0){
				int M = input.nextInt();
				while(M > 0){
					++collection[input.nextInt()];
					--M;
				}
				--N;
			}
			
			int mostCollect = Integer.MAX_VALUE;
			for(int i = 1; i < collection.length; ++i){
				if(collection[i] < mostCollect){
					mostCollect = collection[i];
				}
			}
			
			System.out.println(mostCollect);
		}
	}

}
