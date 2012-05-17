import java.util.Scanner;
import java.math.BigDecimal;

public class d018 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String aLine = input.nextLine();
			Scanner inputString = new Scanner(aLine).useDelimiter("[:\\s]");
			
			BigDecimal oddSum = new BigDecimal("0");
			while(inputString.hasNext()){
				int serialNum = inputString.nextInt();
				BigDecimal realNum = inputString.nextBigDecimal();
				
				if(serialNum % 2 == 1){
					oddSum = oddSum.add(realNum);
				}
				else{
					oddSum = oddSum.subtract(realNum);
				}
			}
			
			System.out.println(oddSum.stripTrailingZeros().toPlainString() );
		}
	}

}
