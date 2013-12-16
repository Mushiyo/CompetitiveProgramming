import java.math.BigDecimal;
import java.util.Scanner;

public class UVa748 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String result = new BigDecimal(input.next()).pow(input.nextInt()).toPlainString().replaceAll("0+?$", "").replaceAll("[.]$", "");
			
			if(result.startsWith("0")){
				result = result.replaceFirst("0", "");
			}
			
			System.out.println(result);
		}
	}

}
