/*
 ID: mushiyo1
 LANG: JAVA
 PROG: ride
 */

import java.util.Scanner;
import java.io.*;

class ride {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("ride.in"));
		PrintWriter output = new PrintWriter(new File("ride.out"));
		
		while(input.hasNext()){
			String cometName = input.next();
			String groupName = input.next();
			
			int cNum = 1, gNum = 1;
			for(int i = 0; i < cometName.length(); ++ i){
				cNum *= cometName.charAt(i) - 'A' + 1;
			}
			
			for(int i = 0; i < groupName.length(); ++ i){
				gNum *= groupName.charAt(i) - 'A' + 1;
			}
			
			if((cNum % 47) == (gNum % 47)){
				output.println("GO");
			}
			else{
				output.println("STAY");
			}
			
		}
		
		input.close();
		output.close();
	}

}
