package CONTEST;

import java.util.Scanner;

public class b187 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("十六進位表示法  相對應的十進位表示法");
		while(input.hasNext()){
			String num16s = input.nextLine();
			int num10 = Integer.parseInt(num16s, 16);
			
			System.out.println("      " + num16s + "                 " + num10);
		}
	}

}
