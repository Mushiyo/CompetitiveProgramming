package CONTEST;

import java.util.Scanner;

public class d887 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long[] mtKinds = new long[26];
		mtKinds[0] = 1;
		
		for(int i = 1 ; i < mtKinds.length; ++i){
			countKind(mtKinds, i);
		}
		
		
		while(input.hasNext()){
			int N = input.nextInt();
			
			System.out.println(mtKinds[N]);
		}
	}
	
	public static void countKind(long[] mtKinds, int N){
		long kinds = 0;
		
		for(int i = 0; i < N; ++i){
			kinds += mtKinds[i] * mtKinds[N - i - 1];
		}
		
		mtKinds[N] = kinds;
	}

}
