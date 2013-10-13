package BASIC;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class a224 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			String s= input.nextLine();
			s = s.toLowerCase();
			Set<Character> charSet = new HashSet<Character>();
			
			for(int i = 0; i < s.length(); ++i){
				if(Character.isLowerCase(s.charAt(i))){
					if(charSet.contains(s.charAt(i))){
						charSet.remove(s.charAt(i));
					}
					else{
						charSet.add(s.charAt(i));
					}
				}
				
			}
			
			if(charSet.size() > 1){
				System.out.println("no...");
			}
			else{
				System.out.println("yes !");
			}
		}
	}
}
