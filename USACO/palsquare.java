/*
ID: mushiyo1
LANG: JAVA
TASK: palsquare
*/
import java.util.Scanner;
import java.io.*;

public class palsquare {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("palsquare.in"));
		PrintWriter output = new PrintWriter(new File("palsquare.out"));
		
		while(input.hasNext()){
			int B = input.nextInt();
			
			for(int i = 1; i <= 300; ++i){
				if(isPalindrom(Integer.toString(i * i, B))){
					output.println(Integer.toString(i, B).toUpperCase() + " " + Integer.toString(i * i, B).toUpperCase());
				}
			}
		}
		
		input.close();
		output.close();
	}
	
	public static boolean isPalindrom(String str){
		int strLen = str.length();
		
		for(int i = 0; i < strLen / 2; ++i){
			if(str.charAt(i) != str.charAt(strLen - 1 - i)){
				return false;
			}
		}
		
		return true;
	}

}
