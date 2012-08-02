import java.util.Scanner;
import java.math.BigInteger;;

public class d266 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BigInteger base = new BigInteger("2");
		BigInteger one = new BigInteger("1");
		
		while(input.hasNext()){
			System.out.println(base.pow(input.nextInt()).subtract(one));
		}
	}

}
