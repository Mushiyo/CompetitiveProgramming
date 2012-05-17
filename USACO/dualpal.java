/*
ID: mushiyo1
LANG: JAVA
TASK: dualpal
*/
import java.util.Scanner;
import java.io.*;

public class dualpal {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(new File("dualpal.in"));
		PrintWriter output = new PrintWriter(new File("dualpal.out"));
		
		while(input.hasNext()){
			int N = input.nextInt();
			int S = input.nextInt();
			
			int printedDualPal = 0;
			while(printedDualPal < N){
				++S;
				if(dualPalindrom(S)){
					output.println(S);
					++printedDualPal;
				}				
			}
		}
		
		input.close();
		output.close();
	}
	
	public static boolean dualPalindrom(int S){
		int palindromTimes = 0;
		for(int base = 2; base <= 10; ++base){
			if(isPalindrom(Integer.toString(S, base))){
				++palindromTimes;
			}
			
			if(palindromTimes >= 2){
				return true;
			}
		}
		
		return false;
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
