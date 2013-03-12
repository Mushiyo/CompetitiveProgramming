package BASIC;

import java.util.*;

public class d562 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int[] An = new int[n];
			
			for(int i = 0; i < An.length; ++i){
				An[i] = input.nextInt();
			}
			
			while(n > 0){
				System.out.print(An[0]);
				for(int i = 1; i < An.length; ++i){
					System.out.print(" " + An[i]);
				}
				System.out.println();
				
				An =  delFirstAndRev(An);
				--n;
			}
		}
	}

	public static int[] delFirstAndRev(int[] An){
				
		int[] delFirstAndRevAn = new int[An.length - 1];
		for(int i = 1; i < An.length; ++i){
			delFirstAndRevAn[delFirstAndRevAn.length - i] = An[i];
		}
		
		return delFirstAndRevAn;
	}
}
