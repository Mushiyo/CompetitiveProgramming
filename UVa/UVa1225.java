
import java.util.Scanner;

public class UVa1225 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int dataSetNum = input.nextInt();
			
			while(dataSetNum > 0){
				int N = input.nextInt();
				StringBuilder numberSequence = new StringBuilder();
				
				for(int i = 1; i <= N; ++i){
					numberSequence.append(Integer.toString(i));
				}
				
				int[] countDigit = new int[10];
				for(int i = 0; i < numberSequence.length(); ++i){
					++countDigit[numberSequence.charAt(i) - '0'];
				}
				
				System.out.print(countDigit[0]);
				for(int i = 1; i < countDigit.length; ++i){
					System.out.print(" " + countDigit[i]);
				}
				System.out.println();
				
				--dataSetNum;
			}
		}
	}

}
