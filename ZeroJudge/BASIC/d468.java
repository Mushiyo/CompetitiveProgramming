//RE
package BASIC;

import java.util.Scanner;
import java.math.BigDecimal;;

public class d468 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigDecimal a = input.nextBigDecimal();
			int n = input.nextInt();
			System.out.println(n);
			
			if(a.compareTo(BigDecimal.ZERO) == 0 && n == 0){
				System.out.println("All Over.");
				break;
			}
			
			System.out.println(a.pow(n));
		}
	}

}
