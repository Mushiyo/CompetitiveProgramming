package NPSC;

import java.util.Scanner;

public class b072 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int n = input.nextInt();
			int m = input.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			StringBuilder code = new StringBuilder();;
			
			while(n > 0){
				code = code.append(input.next());
				
				--n;
			}

			for(int i = 0; i < m; ++i){
				System.out.print(code.charAt(input.nextInt() - 1));
			}
			System.out.println();			
		}
	}

}
