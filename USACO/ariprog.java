/*
ID: mushiyo1
LANG: JAVA
TASK: ariprog
*/

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class ariprog {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(new File("ariprog.in"));
		PrintWriter output = new PrintWriter(new File("ariprog.out"));
		
		while(input.hasNext()){
			int N = input.nextInt();
			int M = input.nextInt();
			boolean[] isBisquares = new boolean[2 * M * M + 1];
			
			//initialize the set of bisquares
			for(int q = 0; q <= M; ++q){
				for(int p = 0; p <= q; ++p){
					isBisquares[p * p + q * q] = true;
				}
			}
			
			boolean isFound = false;
			
			for(int b = 1; (b * (N - 1)) <= (2 * M * M) ; ++b){
				for(int a = 0; (a + b * (N - 1)) <= (2 * M * M); ++a){
					boolean solFound = true;//assume the current pair will be solution
					
					for(int term = 0; term < N; ++term){
						if(!isBisquares[a + term * b]){
							solFound = false;
							break;
						}
					}
					
					if(solFound){
						isFound = true;
						output.println(a + " " + b);
					}
				}
			}
			
			if(!isFound){
				output.println("NONE");
			}
		}
		
		output.close();
		input.close();			
	}

}
