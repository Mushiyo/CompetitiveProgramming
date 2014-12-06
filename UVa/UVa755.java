// TLE

/* Filename: UVa755.java
 * Author: Mushiyo
 */

import java.util.Arrays;
import java.util.Scanner;

public class UVa755 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		int[] telCount = new int[9999999];
		String[] tel = new String[100000];
		
		while(input.hasNext()){
			int dataSetNum = input.nextInt();
			input.nextLine(); // eat change line
			
			boolean isFirstDataSet = true;
			while(dataSetNum > 0){
				input.nextLine(); // eat empty line
				
				int telNum = input.nextInt();
				input.nextLine(); // eat change line
				
				Arrays.fill(telCount, 0);			
				
				for(int i = 0; i < telNum; ++i){
					String telStr = input.nextLine().replaceAll("-","");
					telStr = telStr.replaceAll("[ABC]", "2");
					telStr = telStr.replaceAll("[DEF]", "3");
					telStr = telStr.replaceAll("[GHI]", "4");
					telStr = telStr.replaceAll("[JKL]", "5");
					telStr = telStr.replaceAll("[MNO]", "6");
					telStr = telStr.replaceAll("[PRS]", "7");
					telStr = telStr.replaceAll("[TUV]", "8");
					telStr = telStr.replaceAll("[WXY]", "9");
					
					tel[i] = telStr;
					
					++telCount[Integer.parseInt(telStr)];
				}
				
				Arrays.sort(tel, 0, telNum);
				
				if(isFirstDataSet){
					isFirstDataSet = false;
				}
				else{
					out.append('\n');
				}
				
				boolean hasDuplicate = false;
				for(int i = 0; i < telNum; ++i){
					int appearTimes = telCount[Integer.parseInt(tel[i])];
					if(appearTimes > 1){
						out.append(String.format("%s-%s %d\n", tel[i].substring(0, 3), tel[i].substring(3), appearTimes));
						hasDuplicate = true;
						telCount[Integer.parseInt(tel[i])] = 0;
					}
				}
				
				if(hasDuplicate == false){
					out.append("No duplicates.\n");
				}
				
				--dataSetNum;
			}
		}
		
		System.out.print(out);
	}
}
