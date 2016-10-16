package BASIC;

import java.util.*;

public class d634 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String spell[] = new String[100000];
		
		input.nextLine();//吃掉換行符號
		
		for(int i = 0; i < n; ++i){
			spell[i] = input.nextLine();
		}
		
		Arrays.sort(spell, 0, n);
		
		for(int i = 0; i < n; ++i){
			System.out.println(spell[i]);
		}
		
	}

}
