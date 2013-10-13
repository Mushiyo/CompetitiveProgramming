package BASIC;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class a225 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			Integer[] number = new Integer[n];
			for(int i = 0; i < number.length; ++i){
				number[i] = input.nextInt();
			}
			
			Arrays.sort(number, new Comparator<Integer>(){
				@Override
				public int compare(Integer num1, Integer num2) {
					Integer digitInOne1 = num1 % 10;
					int digitInOne2 = num2 % 10;
					
					if(digitInOne1 != digitInOne2){
						return (digitInOne1 > digitInOne2) ? 1 : -1;
					}
					else{
						if(num1 > num2){
							return -1;
						}
						else if(num1 < num2){
							return 1;
						}
						else{
							return 0;
						}
					}
				}
			});
			
			System.out.print(number[0]);
			for(int i = 1; i < number.length; ++i){
				System.out.print(" " + number[i]);
			}
			System.out.println();
		}
	}
}
