import java.util.Scanner;

public class b082 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		while(N > 0){
			int M = input.nextInt();
			int[] index = new int[M];
			char[] aChar = new char[M];
			int[] next = new int[M];
			
			for(int i = 0; i < M; ++i){
				index[i] = input.nextInt();
				aChar[i] = input.next().charAt(0);
				next[i] = input.nextInt();
			}
			
			System.out.print(aChar[0]);
			int nextIndex = next[0];
			for(int i = 1; i < M; ++i){
				int nextPos = 0;
				for(int j = 0; j < index.length; ++j){
					if(index[j] == nextIndex){
						nextPos = j;
						break;
					}
				}
				
				System.out.print(aChar[nextPos]);
				nextIndex = next[nextPos];
			}
			
			System.out.println();
			--N;
		}
	}

}
