/*
ID: mushiyo1
LANG: JAVA
TASK: gift1
*/

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.*;

public class gift1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("gift1.in"));
		PrintWriter output = new PrintWriter(new File("gift1.out"));
		
		while(input.hasNext()){
			int NP = input.nextInt();
			Map<String, Integer> group = new LinkedHashMap<String, Integer>(NP);
			
			for(int i = 0; i < NP; ++i){
				group.put(input.next(), 0);
			}
			
			
			for(int i = 0; i < NP; ++i){
				String giverName = input.next();
				int totalGivingMoney = input.nextInt();
				int NGi = input.nextInt();
				
				if(NGi == 0){
					continue;
				}
				
				int moneyRemain = totalGivingMoney % NGi;
				int moneyGive = totalGivingMoney / NGi;
				
				Integer giverMoney = group.get(giverName);
				group.put(giverName, giverMoney + moneyRemain - totalGivingMoney);
				
				while(NGi > 0){
					String receiverName = input.next();
					Integer receiverMoney = group.get(receiverName);
					
					group.put(receiverName, receiverMoney + moneyGive);
					--NGi;
				}				
			}
			
			Iterator<String> iterate = group.keySet().iterator();
			
			while(iterate.hasNext()){
				String out = iterate.next();
				output.println(out + " " + group.get(out));
			}
			
		}
		
		input.close();
		output.close();		
	}

}
