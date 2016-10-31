package BASIC;

import java.util.Scanner;

public class d586 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numToEn = "mjqhofawcpnsexdkvgtzblryui";
		int n = input.nextInt();
		
		while(n > 0){
			int length = input.nextInt();//吃掉數字
			
			if(input.hasNextInt()){
				while(length  > 0){
					System.out.print(numToEn.charAt(input.nextInt() - 1));
					--length;
				}
				System.out.println();
			}
			else{
				String cipher = input.nextLine().replace(" ", "");
				System.out.println(dicipher(cipher));
			}
			
			--n;
		}
	}
	
	public static int dicipher(String cipher){
		String sumEnToNum = "uzrmatifxopnhwvbslekycqjgd";
		int sum = 0;
		
		for(int i = 0; i < cipher.length(); ++i){
			for(int j = 0; j < sumEnToNum.length(); ++j){
				if(sumEnToNum.charAt(j) == cipher.charAt(i)){
					sum += (j + 1);
				}
			}
		}
		
		return sum;
	}

}
