/* Filename: Main.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) {
		final int MOD = 1000000000 + 7;
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		System.out.println(0x14);
		System.out.println(0x22);
		
		int n = 12;
		int count = 0;
		
		while(n > 0){
			System.out.println(Integer.toBinaryString(n));
		
			if( (n & 1) == 1 ) {
				++count;
				System.out.println(":)");
			}
			n >>= 1;
			System.out.println(Integer.toBinaryString(n));
		}
		
		System.out.println(Integer.bitCount(12));
		System.out.println(count);

		// probA(in, out);
		// probB(in, out);
		// probC(in, out);

		out.close();
	}

	public static void probA(Scanner input, PrintWriter out) {
		while (input.hasNext()) {
			
		}
	}

	public static void probB(Scanner input, PrintWriter out) {
		while (input.hasNext()) {
			
		}
	}

	public static void probC(Scanner input, PrintWriter out) {
		while (input.hasNext()) {
			
		}
	}

	/*
	 * public static void main(String[] args) { final int MOD = 1000000000 + 7;
	 * InputStream inputStream = System.in; OutputStream outputStream =
	 * System.out; Scanner in = new Scanner(inputStream); PrintWriter out = new
	 * PrintWriter(outputStream);
	 * 
	 * while(in.hasNext()){ int T = in.nextInt();
	 * 
	 * for (int t = 1; t <= T; ++t) { int N = in.nextInt(); int way = 0;
	 * 
	 * for(int i = 1; i <= N; ++i){ for(int j = 1; j <= N; ++j){ for(int k = 1;
	 * k <= N; ++k){ if(i == j){ if(i != k){ continue; } }
	 * 
	 * if(i == k){ if(i != j){ continue; } }
	 * 
	 * if(j == k){ if(i != k){ continue; } }
	 * 
	 * int wayI = N - i + 1; int wayJ = N - j + 1; int wayK = N - k + 1;
	 * 
	 * way += wayI * wayJ * wayK;
	 * 
	 * if(way > MOD){ way %= MOD; } } } }
	 * 
	 * out.printf("Case %d: %d\n", t, way); } }
	 * 
	 * out.close(); }
	 */
}