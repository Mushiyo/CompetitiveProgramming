/* Filename: UVa1588.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class UVa1588 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			StringBuilder masterSection = new StringBuilder(input.next());
			StringBuilder drivenSection = new StringBuilder(input.next());
			
			StringBuilder masterSectionR = new StringBuilder(masterSection).append(String.format("%0"+drivenSection.length()+"d", 0));;
			StringBuilder drivenSectionR = new StringBuilder(drivenSection).append(String.format("%0"+masterSection.length()+"d", 0));
					
			int shift = 0;
			int minLen = Integer.MAX_VALUE;
			while(true){
				boolean isMinLenFound = true;
				for(int i = 0; i < drivenSection.length(); ++i){
					if(intVal(masterSectionR.charAt(shift + i)) + intVal(drivenSection.charAt(i)) > 3){
						isMinLenFound = false;
						++shift;
						break;
					}
				}
				
				if(isMinLenFound){
					int currentLen = Math.max(masterSection.length(), shift + drivenSection.length());
					minLen = Math.min(minLen, currentLen);
					
					break;
				}
			}
			
			shift = 0;
			while(true){
				boolean isMinLenFound = true;
				for(int i = 0; i < masterSection.length(); ++i){
					if(intVal(drivenSectionR.charAt(shift + i)) + intVal(masterSection.charAt(i)) > 3){
						isMinLenFound = false;
						++shift;
						break;
					}
				}
				
				if(isMinLenFound){
					int currentLen = Math.max(drivenSection.length(), shift + masterSection.length());
					minLen = Math.min(minLen, currentLen);
					
					break;
				}
			}
			
			System.out.println(minLen);
		}
	}
	
	private static int intVal(char c){
		return c - '0';
	}
}
