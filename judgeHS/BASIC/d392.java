package BASIC;

import java.util.Scanner;

public class d392 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String[] num = input.nextLine().split("\\s+");
			
			long sum = 0;
			for(int i = 0; i < num.length; ++i){
				sum += Long.parseLong(num[i]);
			}
			
			System.out.println(sum);
		}
	}

}
