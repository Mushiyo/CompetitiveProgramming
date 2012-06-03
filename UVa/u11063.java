import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class u11063 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNum = 1;

		while (input.hasNext()) {
			boolean isB2 = true;			
			int N = input.nextInt();
			int[] seq = new int[N];
			
			for(int i = 0; i < seq.length; ++i){
				seq[i] = input.nextInt();
				if(seq[i] < 1){
					isB2 = false;
				}
				
				if(i > 0){
					if(seq[i] < seq[i - 1]){
						isB2 = false;
					}
				}
			}
			
			Set<Integer> sum = new HashSet<Integer>(N * N);
			
			for(int i = 0; i < seq.length; ++i){
				for(int j = 0; j <= i; ++j){
					if(sum.add(seq[i] + seq[j]) == false){
						isB2 = false;
						break;
					}
				}
				
				if(isB2 == false){
					break;
				}
			}
			
			System.out.print("Case #" + caseNum);
			if(isB2){
				System.out.println(": It is a B2-Sequence.");
			}
			else{
				System.out.println(": It is not a B2-Sequence.");
			}
			
			System.out.println();
			
			++caseNum;
		}
	}
}
