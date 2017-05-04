/* Filename: Codeforces707C.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Codeforces707C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			long n = input.nextLong();
			boolean isExist = false;
			long m = n, k = 1;
			
			for( ; Math.abs(m - k) < n; ++m){
				for(long i = k; Math.abs(m - k) < n; ++i){
					
				}
			}
			
			
			if(isExist){
				System.out.printf("%ld %ld\n", m, k);
			} else {
				System.out.println("-1");
			}
		}
	}

	static boolean isPythagoreanTriples(long u, long v, long w){
		long a = Math.min(u, Math.min(v, w));
		long c = Math.max(u, Math.min(v, w));
		long b = u - a + c - v + w;
		
		return false;
	}
}
