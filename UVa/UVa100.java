import java.util.Scanner;

public class UVa100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int i = input.nextInt();
			int j = input.nextInt();
			int beginNum = Math.min(i, j);
			int endNum = Math.max(i, j);
			
			long maxLen = 1;
			for(long s = beginNum; s <= endNum; ++s){
				long currentLen = countCycleLen(s);
				
				maxLen = Math.max(maxLen, currentLen);
			}
			
			System.out.println(i + " " + j + " " + maxLen);
		}
	}
	
	public static long countCycleLen(long n){
		long cycleLen = 1;
		
		while(n != 1){
			if(n % 2 == 0){
				n = n / 2;
			}
			else{
				n = 3 * n + 1;
			}
			
			++cycleLen;
		}
		
		return cycleLen;
	}

}
