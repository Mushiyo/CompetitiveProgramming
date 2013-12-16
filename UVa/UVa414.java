
import java.util.Scanner;

public class UVa414 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int N = input.nextInt();
			input.nextLine(); // eat change line
			
			if(N == 0){
				break;
			}
			
			char[][] img = new char[N][25];
			for(int i = 0; i < N; ++i){
				img[i] = input.nextLine().toCharArray();
			}
						
			int[] voidCount = new int[N];
			int minVoid = Integer.MAX_VALUE;
			for(int i = 0; i < N; ++i){
				for(int j = 0; j < 25; ++j){
					if(img[i][j] == ' '){
						++voidCount[i];
					}
				}
				
				if(voidCount[i] < minVoid){
					minVoid = voidCount[i];
				}
			}
			
			int totalVoid = 0;
			for(int i = 0; i < N; ++i){
				totalVoid += (voidCount[i] - minVoid);
			}
			
			System.out.println(totalVoid);
		}
	}

}
