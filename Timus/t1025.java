import java.util.Scanner;
import java.util.Arrays;


public class t1025 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int K = input.nextInt();
			int[] voterInGroup = new int[K];
			for(int i = 0; i < voterInGroup.length; ++i){
				voterInGroup[i] = input.nextInt(); 
			}
			
			Arrays.sort(voterInGroup);
			
			int minSupporter = 0;
			for(int i = 0; i < (K/2 + 1); ++i){
				minSupporter += (voterInGroup[i] / 2 + 1);
			}
			
			System.out.println(minSupporter);
		}
	}

}
