/* Filename: UVa644.java
 * Author: Mushiyo
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UVa644 {

	public static void main(String[] args) {
		int setNum = 1;
		List<String> record = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		StringBuilder output = new StringBuilder();

		while (input.hasNext()) {
			record.clear();
			
			while(true){
				String code = input.nextLine();
				
				if(code.equals("9")){
					break;
				}
				else{
					record.add(code);
				}
			}
			
			boolean isImmediatelyDecodable = true;
			for(int i = 0; i < record.size() && isImmediatelyDecodable; ++i){
				String recordI = record.get(i);
				
				for(int j = i + 1; j < record.size(); ++j){
					String recordJ = record.get(j);
					
					if(recordI.startsWith(recordJ) || recordJ.startsWith(recordI)){
						isImmediatelyDecodable = false;
						break;
					}
				}
			}
			
			if(isImmediatelyDecodable){
				output.append(String.format("Set %d is immediately decodable\n", setNum));
			}
			else{
				output.append(String.format("Set %d is not immediately decodable\n", setNum));
			}
			
			++setNum;
		}
		
		System.out.print(output);
	}

}
