package BASIC;

import java.util.Scanner;

public class d491 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			long a = input.nextInt();
			long b = input.nextInt();
			
			long head = Math.min(a, b);
			long end = Math.max(a, b);
			
			if(head % 2 == 1){
				++head;
			}
			
			if(end % 2 == 1){
				--end;
			}
						
			long sum = ((head + end) * ((end - head) / 2 + 1) ) / 2;
			
			System.out.println(sum);
		}
	}

}
