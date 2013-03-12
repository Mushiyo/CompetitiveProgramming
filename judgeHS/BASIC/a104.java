package BASIC;

import java.util.Scanner;

public class a104 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int length = input.nextInt();
			int[] array = new int[length];
			
			for(int i = 0; i < array.length; ++i){
				array[i] = input.nextInt();
			}
			
			java.util.Arrays.sort(array);
			
			System.out.print(array[0]);
			for(int i = 1; i < array.length; ++i){
				System.out.print(" " + array[i]);
			}
			
			System.out.println();
		}
	}

}
