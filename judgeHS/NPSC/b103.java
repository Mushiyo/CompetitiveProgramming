package NPSC;

import java.util.Scanner;
import java.util.ArrayList;

public class b103 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			int m = input.nextInt();
			int n = input.nextInt();
			int w = input.nextInt();
			int h = input.nextInt();
			input.nextLine();//¦Y±¼ªÅ¦r¦ê
			
			ArrayList<String[]> monPics = new ArrayList<String[]>(m);
			
			while(m > 0){
				String[] monPic = new String[h];
				
				for(int i = 0; i < monPic.length; ++i){
					monPic[i] = input.nextLine();
				}
				monPics.add(monPic);
				
				--m;
			}
			
			while(n > 0){
				String[] testPic = new String[h];
				for(int i = 0; i < testPic.length; ++i){
					testPic[i] = input.next();
				}
				
				boolean isMatchFound = false;
				for(int i = 0; i < monPics.size(); ++i){
					if(isMatch(monPics.get(i), testPic)){
						isMatchFound = true;
						break;
					}
				}
				
				if(isMatchFound){
					System.out.println("Y");
				}
				else{
					System.out.println("N");
				}
				
				--n;
			}
		}
	}
	
	public static boolean isMatch(String[] monPic, String[] testPic){
		int matchPoint = 0;
		int unmatchPoint = 0;
		
		for(int i = 0; i < monPic.length; ++i){
			for(int j = 0; j < monPic[i].length(); ++j){
				if(monPic[i].charAt(j) == '-'){
					continue;
				}
				
				if(monPic[i].charAt(j) == testPic[i].charAt(j)){
					++matchPoint;
				}
				else{
					++unmatchPoint;
				}
			}
		}
		
		if(matchPoint >= 4 * unmatchPoint){
			return true;
		}
		else{
			return false;
		}
	}

}
