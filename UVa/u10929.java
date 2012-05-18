import java.util.Scanner;

public class u10929 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String N = input.next();
			if(N.equals("0")){
				break;
			}
			
			int oddSum = 0;
			int evenSum = 0;
			boolean countingOdd = true;
			
			for(int i = N.length() - 1; i >= 0 ; --i){
				if(countingOdd){
					oddSum += Character.getNumericValue(N.charAt(i));
				}
				else{
					evenSum += Character.getNumericValue(N.charAt(i));
				}
				countingOdd = !countingOdd;
			}
			
			System.out.print(N + " ");
			if((oddSum - evenSum) % 11 == 0){
				System.out.println("is a multiple of 11.");
			}
			else{
				System.out.println("is not a multiple of 11.");
			}
		}
	}

}
