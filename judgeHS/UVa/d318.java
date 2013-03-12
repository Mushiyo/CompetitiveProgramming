package UVa;

import java.util.Scanner;

public class d318 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 0;
		
		while(input.hasNext()){
			N = input.nextInt();
			if(N < 0){
				break;
			}
			
			System.out.println(Integer.toString(N, 3));
		}
	}

}
