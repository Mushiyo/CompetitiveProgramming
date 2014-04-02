/* Filename: NumberTheory.java
 * Author: Mushiyo
 */
package Math;

public class NumberTheory {

	// Greatest common divisor
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	// Longest common multiple
	public static int lcm(int a, int b){
		// gcd(a, b) * lcm(a, b) = a * b
		// lcm(a, b) = (a * b) / gcd(a, b)
		// since a * b might overflow
		// so use a / gcd(a, b) * b
		return a / gcd(a, b) * b;
	}
	
	public static long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}
}
