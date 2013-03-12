package BASIC;

import java.util.*;

public class d587 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int[] array = new int[n];
			
			for(int i = 0; i < array.length; ++i){
				array[i] = input.nextInt();
			}
			
			Arrays.sort(array);
			
			System.out.print(array[0]);
			for(int i = 1; i < array.length; ++i){
				System.out.print(" " + array[i]);				
			}
			
			System.out.println();
		}
	}

}
