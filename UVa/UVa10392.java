// WA
// TLE

/* Filename: UVa10392.java
 * Author: Mushiyo
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UVa10392 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isFirstOutput = true;
		System.out.println(Long.MAX_VALUE);

		while (input.hasNext()) {
			long n = input.nextLong();
			
			if(n < 0){
				break;
			}
			
			if(n > 1){
				if(isFirstOutput){
					isFirstOutput = false;
				}
				else{
					System.out.println();
				}
				
				ArrayList<Long> nFactors = factor(n);
				
				for(int i = 0; i < nFactors.size(); ++i){
					System.out.println("    " + nFactors.get(i));
				}
			}
		}
	}
	
	public static ArrayList<Long> factor(long n) {
		long sqrtN = (long)Math.sqrt(n);
		ArrayList<Long> factor = new ArrayList<Long>();

		for (long i = 2; i <= sqrtN; ++i) {
			while (n % i == 0) {
				factor.add(i);
				n /= i;
			}
		}
		
		if(n != 1){
			factor.add(n);
		}

		return factor;
	}

}
