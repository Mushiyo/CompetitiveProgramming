package BASIC;

import java.util.*;

public class d634 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		TreeSet<String> spell = new TreeSet<String>();
		
		input.nextLine();//¦Y±¼´«¦æ²Å¸¹
		
		for(int i = 0; i < n; ++i){
			spell.add(input.nextLine());
		}			
		
		for(String i : spell){
			System.out.println(i);
		}
		
	}

}
