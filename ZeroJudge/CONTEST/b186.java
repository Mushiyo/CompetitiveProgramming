package CONTEST;

import java.util.Scanner;

public class b186 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int cookie = input.nextInt();
			int chocolate = input.nextInt();
			int cake = input.nextInt();
			chocolate += giftChocolate(cookie, cake);
			
			System.out.println(cookie + " 個餅乾，" + chocolate + " 盒巧克力，" + cake + " 個蛋糕。");
		}
	}
	
	public static int giftChocolate(int cookie, int cake){
		int cookie10 = cookie / 10;
		int cake2 = cake / 2;
		
		return Math.min(cookie10, cake2);
	}

}
