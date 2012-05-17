import java.util.Scanner;
import java.math.*;

public class c034 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger sum = new BigInteger("0");
		
		while(input.hasNext()){
			BigInteger VeryLongInteger = input.nextBigInteger();
			
			if(VeryLongInteger.equals(BigInteger.ZERO)){
				System.out.println(sum);
				break;
			}
			else{
				sum = sum.add(VeryLongInteger);				
			}
		}
	}

}
